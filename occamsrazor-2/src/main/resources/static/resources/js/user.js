"use strict"
var user = user || {}  // null의 의미
user = (()=>{
	let init = () => { // 초기화 
		alert('1')
		onCreate()
	}
	let onCreate = () =>{ // 만들어 지면 바로 자바에 가서 일을 함
		setContentView()
		 $('#register_a').click(e=>{
		     	e.preventDefault()
		     	location.href = "/admin"
		     })
		     $('#access_a').click(e=>{
		    	 
		     })
		
	} 
	let setContentView = () =>{  // 콘텐츠의 내용을 그림
	     $('#kcdc').css({ width: '80%', height: '900px' }).addClass('border_black center')
	     $('#tr_1').css({ width: '80%', height: '50px' }).addClass('border_black center')
	     $('#menu').css({ width: '80%', height: '50px' }).addClass('border_black center')
	     $('#kcdc td').addClass('border_black', 'width_full')
	}
	return {init} // 스크립트를 html로 보내주는 역할
	
})()