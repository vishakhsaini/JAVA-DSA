const dec = document.getElementById("dec");
const reset = document.getElementById("reset");
const inc = document.getElementById("inc");
const num = document.getElementById("num");
let count = 0;

inc.onclick=function(){
    count++;
    num.textContent=count;
}
dec.onclick=function(){
    count--;
    num.textContent=count;
}
reset.onclick=function(){
    num.textContent=0;
    count=0;
}