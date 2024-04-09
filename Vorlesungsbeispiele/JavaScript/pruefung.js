function pruefen()
{
 var res = true;
 var formular = document.form1;
 if(formular.Namensfeld.value == ''){res = false;}
 if(formular.Anschriftsfeld.value == ''){res = false;}
 if(formular.EMailfeld.value == ''){res = false;}
 if(formular.Eingabe.value == ''){res = false;}
		  
var reg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
				  
 if(reg.test(formular.EMailfeld.value) == false){res = false;}

       
 if(formular.News[0].checked == false && formular.News[1].checked == false)
 {res = false;}

       
 if(formular.Betreff.selectedIndex == 0){res = false;}

       
 if(res == false){alert('Bitte Formular vollständig ausfüllen!')}
 return res;
}