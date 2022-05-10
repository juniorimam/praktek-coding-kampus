$(document).ready(function() {
    var canvas = $("#gameCanvas");
    var context = canvas.get(0).getContext("2d");
    // Canvas dimensions
    var canvasWidth = canvas.width();
    var canvasHeight = canvas.height();
    // variabel Game settings 
    var playGame;
    var asteroids;
	var bullets;
    var numAsteroids;    
    var player;
    var score;
    var scoreTimeout;
    var arrowUp = 38;
    var arrowRight = 39;
    var arrowDown = 40;
	var keySpace = 32;
    var Asteroid = function(x, y, radius, vX) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.vX = vX;
    };
    var Player = function(x, y) {
        this.x = x;
        this.y = y;
        this.width = 24;
        this.height = 24;
        this.halfWidth = this.width/2;
        this.halfHeight = this.height/2;
        this.vX = 0;
        this.vY = 0;
        this.moveRight = false;
        this.moveUp = false;
        this.moveDown = false;
        this.flameLength = 20;
    };
	var Bullet = function(x, y) {
		this.x = x;
		this.y = y;
		this.width = 5;
		this.height = 5;		
		this.halfWidth = this.width/2;
        this.halfHeight = this.height/2;
        this.vX = 10;
	};
	
    // Game UI (variabel tambpilan )
    var ui = $("#gameUI");
    var uiIntro = $("#gameIntro");
    var uiStats = $("#gameStats");
    var uiOver = $("#gameOver");
    var uiPlay = $("#gamePlay");
    var uiReset = $(".gameReset");
    var uiScore = $(".gameScore");
    var uiComplete = $('#gameComplete');
	
	// sound game  (variabel sound )
    var soundBackground = $("#gameSoundBackground").get(0);
    var soundThrust = $("#gameSoundThrust").get(0);
    var soundDeath = $("#gameSoundDeath").get(0);
	var soundBoom = $("#gameSoundBoom").get(0);
    var soundWin = $("#gameSoundWin").get(0);


    // Reset and start the game    
    function startGame() {
        // Reset game stats
        uiScore.html("0");
        uiStats.show();


        // Set up awal game
        playGame = false;
        asteroids = new Array();
		bullets = new Array();
        numAsteroids = 30;
        score = 0;
        player = new Player(150, canvasHeight/2);
		
		// buat asteroid awal
        for (var i = 0; i < numAsteroids; i++) {
            var radius = 5+(Math.random()*10);
            var x = canvasWidth+radius+Math.floor(Math.random()*canvasWidth);
            var y = Math.floor(Math.random()*canvasHeight);
            var vX = -5-(Math.random()*5);
            asteroids.push(new Asteroid(x, y, radius, vX));

        };
        
        $(window).keydown(function(e) {
            var keyCode = e.keyCode;
            if (!playGame) {                
                playGame = true;
                timer();
                //soundBackground dinyalakan
                soundBackground.play();
                animate();
            };
            if (keyCode == arrowRight) { // panah kanan ditekan
                if (soundThrust.paused) { // munculkan gas
                     soundThrust.play();
                };
                player.moveRight = true;
            } else if (keyCode == arrowUp) {
                player.moveUp = true;
            } else if (keyCode == arrowDown) {
                player.moveDown = true;
            };
        });
        $(window).keyup(function(e) {
            var keyCode = e.keyCode;
            if (keyCode == arrowRight) {
                soundThrust.pause();
                player.moveRight = false;
            } else if (keyCode == arrowUp) {
                player.moveUp = false;
            } else if (keyCode == arrowDown) {
                player.moveDown = false;
            } else if (keyCode == keySpace) { // menembak
			     // buat peluuru
				bullets.push(new Bullet(player.x, player.y));
            }
        });
        // loop menjalankan animasi dari game
        animate();
    };
	
    // Inititialize the game environment
	// mendefinisikan lingkungan game
    function init() {
        uiStats.hide();
        uiOver.hide();
        uiComplete.hide();
        uiPlay.click(function(e) {
            e.preventDefault();
            uiIntro.hide();
            startGame();
        });
        uiReset.click(function(e) {
            e.preventDefault();
            uiOver.hide();
            uiComplete.hide();
            $(window).unbind("keyup");
            $(window).unbind("keydown");
            clearTimeout(scoreTimeout);
            soundThrust.pause();
            soundBackground.pause()
            startGame();
        });
    };
    
	// mengitung waktu bermain
	function timer() {
        if (playGame) {
            if (score % 5 == 0) {
                numAsteroids += 5;
            };
            scoreTimeout = setTimeout(function() {
                uiScore.html(++score);
                timer();
            }, 1000);
        };
    };
	
    // Animation loop that does all the fun stuff
    function animate() {
        // Clear
        context.clearRect(0, 0, canvasWidth, canvasHeight);
		
        if (score == 30) {
            soundThrust.pause();
            // soundDeath.currentTime = 0;
            soundWin.play();
            // Game over
            playGame = false;
            clearTimeout(scoreTimeout);
            uiStats.hide();
            uiComplete.show();
            soundBackground.pause();
            $(window).unbind("keyup");
            $(window).unbind("keydown");
        }
        
		// cetak peluru dari pesawat
		var bulletsLength = bullets.length;
		for (var i = 0; i < bulletsLength; i++) {
			var tmpBullet = bullets[i];
			
			context.fillStyle = "rgb(255, 255, 255)";
            context.beginPath();
            context.arc(tmpBullet.x, tmpBullet.y, 5, 0, Math.PI*2, true);
            context.closePath();
            context.fill();
			
			tmpBullet.x += tmpBullet.vX;
		}
		
		// cetak asteroid
        var asteroidsLength = asteroids.length;
        for (var i = asteroidsLength-1; i > -1; i--) {
            var tmpAsteroid = asteroids[i];
            
            if (tmpAsteroid.x+tmpAsteroid.radius < 0) {
                tmpAsteroid.radius = 5+(Math.random()*10);
                tmpAsteroid.x = canvasWidth+tmpAsteroid.radius;
                tmpAsteroid.y = Math.floor(Math.random()*canvasHeight);
                tmpAsteroid.vX = -5-(Math.random()*5);
            };            
            
            tmpAsteroid.x += tmpAsteroid.vX;
            context.fillStyle = "rgb(255, 0, 0)";
            context.beginPath();
            context.arc(tmpAsteroid.x, tmpAsteroid.y, tmpAsteroid.radius, 0, Math.PI*2, true);
            context.closePath();
            context.fill();
            
			
			// cek tabarakan pesawat dengan asteroid
            var dX = player.x - tmpAsteroid.x;
            var dY = player.y - tmpAsteroid.y;
            var distance = Math.sqrt((dX*dX)+(dY*dY));
            if (distance < player.halfWidth+tmpAsteroid.radius) {
                soundThrust.pause();
                // soundDeath.currentTime = 0;
                soundDeath.play();
                // Game over
                playGame = false;
                clearTimeout(scoreTimeout);
                uiStats.hide();
                uiOver.show();
                soundBackground.pause();
                $(window).unbind("keyup");
                $(window).unbind("keydown");
            };
			
			
			// cek tabarakan asteroid dengan peluru
			var bulletsLength = bullets.length;
			for (var j = bulletsLength-1; j > -1; j--) {
				var tmpBullet = bullets[j];
				
				var dX2 = tmpBullet.x - tmpAsteroid.x;
				var dY2 = tmpBullet.y - tmpAsteroid.y;
				var distance2 = Math.sqrt((dX2*dX2)+(dY2*dY2));
				if (distance2 < tmpBullet.halfWidth+tmpAsteroid.radius) {
					var idxAs = asteroids.indexOf(tmpAsteroid);
					var idxBu = bullets.indexOf(tmpBullet);
					
					asteroids.splice(idxAs,1);
					bullets.splice(idxBu,1);
					
					soundBoom.play();
					break;
				}
			}
        };
		
		// menentukan besarnya perubah posisi pesawat
        player.vX = 0;
        player.vY = 0;
        if (player.moveRight) {
            player.vX = 3;
        } else {
            player.vX = -3;
        };
        if (player.moveUp) {
            player.vY = -3;
        };
        if (player.moveDown) {
            player.vY = 3;
        };
		// merubah posisi pesawat
        player.x += player.vX;
        player.y += player.vY;
        
        if (player.x-player.halfWidth < 20) {
            player.x = 20+player.halfWidth;
        } else if (player.x+player.halfWidth > canvasWidth-20) {
            player.x = canvasWidth-20-player.halfWidth;
        }
        if (player.y-player.halfHeight < 20) {
            player.y = 20+player.halfHeight;
        } else if (player.y+player.halfHeight > canvasHeight-20) {
            player.y = canvasHeight-20-player.halfHeight;
        };
        
        if (player.moveRight) { // saat ditekan panah kanan
            context.save();
            context.translate(player.x-player.halfWidth, player.y);
            if (player.flameLength == 20) {
                player.flameLength = 15;
            } else {
                player.flameLength = 20;
            };
          
          // buat asap pesawat             
		 context.fillStyle = "orange";
            context.beginPath();
            context.moveTo(0, -5);
            context.lineTo(-player.flameLength, 0);
            context.lineTo(0, 5);
            context.closePath();
            context.fill();
            context.restore();
        }

        // menambah jumlah asteroid jika jumlahnya 
        // kurang dari batas numAsteroids
        while (asteroids.length < numAsteroids) {
            var radius = 5+(Math.random()*10);
            var x = Math.floor(Math.random()*canvasWidth)+canvasWidth+radius;
            var y = Math.floor(Math.random()*canvasHeight);
            var vX = -5-(Math.random()*5);
            asteroids.push(new Asteroid(x, y, radius, vX));
        };
        
		//Buat pesawat
        context.fillStyle = "rgb(0,0,0)";
        context.beginPath();
        context.moveTo(player.x+player.halfWidth, player.y);
        context.lineTo(player.x-player.halfWidth, player.y-player.halfHeight);
        context.lineTo(player.x-player.halfWidth, player.y+player.halfHeight);
        context.closePath();
        context.fill();
        
		// jalankan game
        if (playGame) {
            // Run the animation loop again in 33 milliseconds
            setTimeout(animate, 33);
        };
    };
    init();
});