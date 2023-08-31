function validate(){
   let fn = document.forms["myform"]["fn"].value;

   if(fn == ""){
      alert('First Name Can not be empty')
      return false;
   }


   let ln = document.forms["myform"]["ln"].value;

   if(ln == ''){
    alert('Last Name Can not be empty')
    return false;
   }

   let email = document.forms["myform"]["em"].value;
   if(email == ''){
    alert('Email Can not be Empty')
    return false;
   }

   let mob = document.forms["myform"]["mob"].value;
}