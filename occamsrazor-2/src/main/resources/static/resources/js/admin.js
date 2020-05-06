"use strict"
var admin = admin || {}
admin = (() => {
	const WHEN_ERROR = `호출하는 JS 파일을 찾지 못했습니다.`
	let user_vue
	let init = () => {
		user_vue=`/resources/vue/user_vue.js`
		onCreate()
	}
	let onCreate = () => {
		$.when(
				$.getScript(user_vue)
				).done(()=>{
					setContentView()
					$.getJSON('/users', d => {
						$('#total_count').text('총 회원수 :'+d.length)
						$.each(d, (i, j) => {
							$(`<tr>
			                        	<td>
			                                <span>${i+1}</span>
			                            </td>
			                            <td>
			                                <span>${j.userid}</span>
			                            </td>
			                            <td>
			                                <span id="user_`+(i+1)+`"></span>
			                            </td>
			                             <td>
			                                <span>${j.ssn}</span>
			                            </td>
			                           <td>
			                                <span>${j.email}</span>
			                            </td>
			                            <td>
			                                <span>${j.phoneNumber}</span>
			                            </td>
			                            <td>
			                                <span>${j.registerDate}</span>
			                            </td>
			                        </tr>`).appendTo('#userData')
			                        $(`<a>${j.name}</a>`)
			                        .css({cursor: 'pointer',color: 'blue'})
			                        .appendTo("#user_"+(i+1))
			                        .click(e => {
			                        	$('#userData').empty()
			                        	$(userVue.detail()).appendTo('#userData')
			                        	$.getJSON(`/users/${j.userid}`, d=> {
			                        		$('#userId').text(d.userid)
			                        		$('#userName').text(d.name)
			                        		$('#userSSN').text(d.ssn)
			                        		$('#userAddr').text(d.addr)
			                        		$('#userEmail').text(d.email)
			                        		$('#userPhoneNumber').text(d.phoneNumber)
			                        		$('#registerDate').text(d.registerDate)
			                        	})
			                        })  	
			                   	}) // each 	
			                }) // getJSON 
				$('#lost').click(e=>{
					e.preventDefault()
					$('#userData').empty()
					alert('1')
					$.getJSON('/losts', d=>{
						$.each(d, (i, j) => {
							$(`<tr>
		                        	<td>
		                                <span>${j.no1}</span>
		                            </td>
		                            <td>
		                                <span>${j.no2}</span>
		                            </td>
		                            <td>
		                                <span>${j.no3}</span>
		                            </td>
		                             <td>
		                                <span>${j.no4}</span>
		                            </td>
		                           <td>
		                                <span>${j.no5}</span>
		                            </td>
		                        </tr>`).appendTo('#userData')
							})
						})
					})
				}).fail(()=>{
					alert(WHEN_ERROR)
				})
		
            }
	let setContentView = () => {
		$('#userData tr').first().css({'background-color':'yellow'})
	}
	return {init}
})()
