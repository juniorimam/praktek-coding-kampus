$(document).ready(function() {
    var canvas = $("#gameCanvas");
    var context = canvas.get(0).getContext("2d");
    
    var canvasWidth = canvas.width();
    var canvasHeight = canvas.height();
  
	// devinisi variabel
    
    var lakon;
	var apels;
	var Meteors;
	var numMeteor;
	var numApel;
	var step_y=5;
	var step_j=7;
	
	var stepX=10;
	var arrowUp = 38;
    var arrowRight = 39;
    var arrowDown = 40;
	var keySpace = 32;
	var arrowLeft=37;
	
	
	
	// Buat objek lakon
	var Lakon = function(x, y) {
	this.x = x;
    this.y = 480;
	this.moveRight = false;
   	this.moveLeft = false;
	}
	
	// baca gambar lakon berupa kotak bata
   var glakon = new Image(); 
   glakon.src = "img/balok.jpg";
 
 // fungsi cetak gambar lakon
   function draw_lakon(x,y){
     context.drawImage(glakon,0,0,107,35,x,y,107,35);
    };
	
	  
	// Buat objek Apel  
	var Apel = function(x, y) {
        this.x = x;
        this.y = y;
        
    };

    // Buat objek Meteor 
	var Meteor = function(x, y) {
        this.x = x;
        this.y = y;
        
    };

	// baca atau ambil Objek Apel
	var gApel = new Image(); 
   gApel.src = "img/apel.png";

   // baca atau ambil Objek Meteor
	var gMeteor = new Image(); 
   gMeteor.src = "img/meteor.png";
 
   // fungsi cetak objek apel
  function draw_Apel(x,y){
     context.drawImage(gApel,0,0,32,38,x,y,32,38);
    };

    // fungsi cetak objek Meteor
  function draw_Meteor(x,y){
     context.drawImage(gMeteor,0,0,100,216,x,y,100,216);
    };
	
	   
	
	// Reset and start the game    
   
   function startGame() {
        // Reset game stats
		
        lakon=new Lakon(300,200);
	  
	  // numApel jumlah  apel
       numApel=5;
	   apels = new Array(); //buat objek apel
		
		
		// buat objek apel sebanyak numApel=6, krn index dari 0
		for (var i = 0; i < numApel; i++) {
            var x = Math.floor(Math.random()*canvasWidth);
          	var y = Math.floor(Math.random()*50);;
            apels.push(new Apel(x, y));
        };

      // numApel jumlah  Meteor
       numMeteor=7;
	   Meteors = new Array(); //buat objek Meteor
		
		
		// buat objek Meteor sebanyak numMeteor=8, krn index dari 0
		for (var j = 0; j < numMeteor; j++) {
            var x = Math.floor(Math.random()*canvasWidth);
          	var y = Math.floor(Math.random()*50);;
            Meteors.push(new Meteor(x, y));
        };
		
		//

		
        $(window).keydown(function(e) {
            var keyCode = e.keyCode;
            
            if (keyCode == arrowRight) {
             lakon.moveRight = true;
            } else if (keyCode == arrowUp) {
                lakon.moveUp = false;
            } else if (keyCode == arrowLeft) {
                lakon.moveLeft = true;
            } 
			else if (keyCode == arrowDown) {
                lakon.moveDown = false;
            };
			
        });
        $(window).keyup(function(e) {
            var keyCode = e.keyCode;
            if (keyCode == arrowRight) {
              lakon.moveRight = false;
            } else if (keyCode == arrowUp) {
                lakon.moveUp = false;
            } else if (keyCode == arrowDown) {
                lakon.moveDown = false;
            } else if (keyCode == arrowLeft) {
				lakon.moveLeft = false;
            }
        });
        
		// Start the animation loop
		animate();
    };
  
  // Inititialize the game environment
    function init() {
       
            startGame();
       
      
    };
    
	
    // Animation loop that does all the fun stuff
    function animate() {
        // Clear
        context.clearRect(0, 0, canvasWidth, canvasHeight);
				
				
	// cetak apels bergerak kebawah
	var apelsLength = apels.length;
        for (var i = apelsLength-1; i > -1; i--) {
            var tmpApel= apels[i];
            draw_Apel(tmpApel.x,tmpApel.y);
		  apels[i].y=apels[i].y+step_y; // mengerakkan kebawah tambah y
		} 

	// cek apel jatuh sampai tanah
	// 530 batas bawah / tanah
	 	var apelsLength = apels.length;
        for (var i = apelsLength-1; i > -1; i--) {
			  var tmpApel= apels[i];
            apels[i].y=apels[i].y+step_y;
			if( apels[i].y>=530){
					var idxAs = apels.indexOf(tmpApel);
					apels.splice(idxAs,1);
			}
		} 

		// cetak Meteors bergerak kebawah
	var MeteorsLength = Meteors.length;
        for (var j = MeteorsLength-1; j > -1; j--) {
            var tmpMeteor= Meteors[j];
            draw_Meteor(tmpMeteor.x,tmpMeteor.y);
		  Meteors[j].y=Meteors[j].y+step_j; // mengerakkan kebawah tambah y
		}        
		
	
	// cek Meteor jatuh sampai tanah
	// 350 batas bawah / tanah
	 	var MeteorsLength = Meteors.length;
        for (var j = MeteorsLength-1; j > -1; j--) {
			  var tmpMeteor= Meteors[j];
            Meteors[j].y=Meteors[j].y+step_j;
			if( Meteors[j].y>=350){
					var idxAs = Meteors.indexOf(tmpMeteor);
					Meteors.splice(idxAs,1);
			}
		} 
		
		
		
				
	if (lakon.moveRight) {lakon.x=lakon.x+stepX;}
		if (lakon.moveLeft) {lakon.x=lakon.x-stepX;}
		
      	
		// apel jumlahnya kurang dari numapel =5 . tambahkan 1 apel
		while (apels.length < numApel) {
			// tentukan koordinat x dan y untuk apel yang baru
			var x = Math.floor(Math.random()*canvasWidth);
          	var y = Math.floor(Math.random()*50);;
            apels.push(new Apel(x, y)); // buat 1 apel 
			}
		
		 

    if (lakon.moveRight) {lakon.x=lakon.x+stepX;}
		if (lakon.moveLeft) {lakon.x=lakon.x-stepX;}
		
      	
		// Meteor jumlahnya kurang dari numMeteor =7 . tambahkan 1 Meteor
		while (Meteors.length < numMeteor) {
			// tentukan koordinat x dan y untuk Meteor yang baru
			var x = Math.floor(Math.random()*canvasWidth);
          	var y = Math.floor(Math.random()*50);;
            Meteors.push(new Meteor(x, y)); // buat 1 Meteor
			}
		
		 draw_lakon(lakon.x,lakon.y);
	        setTimeout(animate, 33);
    
    };
	
    init();
					
		
});