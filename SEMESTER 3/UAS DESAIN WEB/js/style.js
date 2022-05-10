

/*-----------------------------for header--------------------------------*/
function myFunction() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
        x.className += " responsive";
        
    }
    else {
        x.className = "topnav";
        
    }

}

//show or hide drop down, and change icons

function dropDisplay() {
    var y = document.getElementById("dropDis");
    var z = document.getElementById("dropIcons");
    if (y.className === "Drop_items") {
        y.className += " hideDrop_items";
         z.className = "fas fa-caret-down";
    }
    else {
        y.className = "Drop_items";
        z.className += "fas fa-caret-up";
    }

}


function dropDisplay2() {
    var y = document.getElementById("dropDis2");
    var z = document.getElementById("dropIcons2");
    if (y.className === "Drop_items") {
        y.className += " hideDrop_items";
         z.className = "fas fa-caret-down";
    }
    else {
        y.className = "Drop_items";
        z.className += "fas fa-caret-up";
    }

}


//hide drop down if user click outside of dropdown
window.onclick = function(e) {
  if (!e.target.matches('.dropbtn')) {
    var x = document.getElementById("dropDis");
    var ic = document.getElementById("dropIcons");
      if (x.classList.contains('Drop_items')) {
        x.classList.add('hideDrop_items');
        ic.className = "fas fa-caret-down";
      }
  }

  if (!e.target.matches('.dropbtn2')) {
    var x = document.getElementById("dropDis2");
    var ic = document.getElementById("dropIcons2");
      if (x.classList.contains('Drop_items')) {
        x.classList.add('hideDrop_items');
        ic.className = "fas fa-caret-down";
      }
  }
}

/*-----------------------------end header--------------------------------*/

$(window).scroll(example); 
function example() {
    var tempScrollTop = $(window).scrollTop();
    // console.log("Scroll from Top: " + tempScrollTop.toString());
    var y = document.getElementById("test");
    var z = document.getElementById("test1");
    if (tempScrollTop > 2500 && y.className === "map-responsive defaultpos hide")
    {
        y.className = "map-responsive defaultpos";
    }

    if (tempScrollTop > 2500 && z.className === "col-md-12 default mText")
    {
        z.className = "col-md-12 default";
    }
};