const btn = document.getElementById("btn");
const img = document.getElementById("img");
btn.onclick=function(){
    console.log(img.src);
    console.log(img.src.length);
    let j = img.src.slice(40);
    console.log(j);
    
    if(j=="vishu.jpg"){
        img.src="vishu2.png";
    }else{
        img.src="vishu.jpg";
    }
}