let thisPage = 1;
let limit = 15;
let list = document.querySelectorAll('.grid__column-2-4 .home-content-item');
function loadItem(){
    let beginGet = limit * (thisPage - 1);
    let endGet = limit * thisPage - 1;
    list.forEach((item, key)=>{
    	if(key >= beginGet && key <= endGet){
   			item.style.display = 'block';
  		}
    	else{
    		item.style.display = 'none';
   		}
    })
    listPage();
}
loadItem();

function listPage(){
	let count = Math.ceil(list.length / limit);
	document.querySelector('.listPage').innerHTML = '';
	
	let prev = document.createElement('li');
	prev.innerText = "<";
	if(thisPage != 1){
	prev.setAttribute('onclick', "changPage(" + (thisPage - 1) +")");
	}
	document.querySelector('.listPage').appendChild(prev);
	let newPage = document.createElement('span');
	newPage.innerText = thisPage+"/"+count;
	document.querySelector('.listPage').appendChild(newPage);
	let next = document.createElement('li');
	next.innerText = ">";
	if(thisPage != count){
	next.setAttribute('onclick', "changPage(" + (thisPage + 1) +")");
	}
	document.querySelector('.listPage').appendChild(next);
}

function changPage(i){
	thisPage = i;
	loadItem();
}