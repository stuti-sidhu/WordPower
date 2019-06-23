var xmlobj;
function userconfirm()
{
    var flag =true;
    if(document.getElementById("txtUserID").value.length==0){
        s3.innerHTML="User ID is empty!";
        flag=false;
    }
    else
    {
        var v = document.getElementById("txtUserID").value;
        if(window.XMLHttpRequest)
            xmlobj = new XMLHttpRequest();
        else if(window.ActiveXObject)
            xmlobj = new ActiveXObject("Microsoft.XMLHTTP");
        
        xmlobj.readyState
        xmlobj.onreadystatechange=handleRequest;
        xmlobj.open("post","User?uid="+v,true);
        xmlobj.send()
    }
    return flag;
}
function validateData()
{
    var flag = true;
    var s1=document.getElementById("sp1");
    var s2=document.getElementById("sp2");
    var s3=document.getElementById("sp3");
    var s4=document.getElementById("sp4");
    var s5=document.getElementById("sp5");
    var s6=document.getElementById("sp6");
    var s7=document.getElementById("sp7");
    
    s1.innerHTML="";
    s2.innerHTML="";
    s3.innerHTML="";
    s4.innerHTML="";
    s5.innerHTML="";
    s6.innerHTML="";
    s7.innerHTML="";
   
    if(document.getElementById("txtName").value.length==0){
        s1.innerHTML="Name Empty !";
        flag=false;
    }
    var rbt1 = document.getElementById("rbtMale");
    var rbt2 = document.getElementById("rbtFemale");
    
    if(rbt1.checked==false && rbt2.checked==false){
        s2.innerHTML="Gender not selected !";
        flag=false;
    }
    if(document.getElementById("txtUserID").value.length==0){
        s3.innerHTML="User ID is empty !";
        flag=false;
    }
    
    if(document.getElementById("txtPassword").value.length<8){
        s4.innerHTML="Password should be atleast 8 character long !";
        flag=false;
    }
    if(document.getElementById("txtPassword").value.length>8){            
    if(document.getElementById("txtPassword").value!=document.getElementById("txtConfirmPassword").value){
        s5.innerHTML="Password and Confirm Password do not match !";
        flag=false;
    }   }
    else{
        s4.innerHTML="Password should be atleast 8 character long !";
        flag=false;
    }
    if(document.getElementById("ddlSecurityQuestion").selectedIndex==0){
        s6.innerHTML="Question not selected !";
        flag=false;
    }
    if(document.getElementById("txtAnswer").value.length==0){
        s7.innerHTML="Answer empty !";
        flag=false;
    }
    return flag;
}
function handleRequest()
{
    if(xmlobj.readyState==4)
    {
        var x = xmlobj.responseText;
        document.getElementById("sp3").innerHTML=x;
    }
}
