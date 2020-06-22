console.log("Hello Home Page");
let windowScreenY =window.screenY;
let windowScreenX =window.screenY;
console.log(windowScreenY);
console.log(windowScreenX);

let my_body=document.getElementById('body-main');

window.addEventListener('scroll',ev=>{
        console.log(window.pageYOffset);
        console.log(window.pageXOffset);
})