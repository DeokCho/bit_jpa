"use strict"

var admin = admin || {}

admin = (() => {
	let init = () => {
		onCreate()
	}
	let onCreate = () => {
		setContentView()
		$.getJSON('/users', d=>{
			$.each(d, (i,j)=>{
				$(`<tr>
				<tr>
                <td>
                    <span>1.</a>
                </td>
                <td>
                    <span>1</a>
                </td>
                 <td>
                    <span>1</a>
                </td>
               <td>
                    <span>1</a>
                </td>
                <td>
                    <span>1</a>
                </td>
                <td>
                    <span>1</a>
                </td>
                <td>
                    <span>1</a>
                </td>
                </tr>`).appendTo('#userData')
			})
		})
	}
	let setContentView = () => {
		 $('#userData tr').first().css({'background-color' : 'yellow'})
	}
	return {init}
	
})()