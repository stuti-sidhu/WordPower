var flag;
var xmlobj;
function checkPassword()
{
    flag = true;

    var s1 = document.getElementById("sp1")
    s1.innerHTML = "";

    if (document.getElementById("txtOldPassword").value.length == 0)
    {
        s1.innerHTML = "Old password empty!";
        flag = false;
    } else
    {
        var x = document.getElementById("txtOldPassword").value;
        if (window.XMLHttpRequest)
        {
            xmlobj = new XMLHttpRequest();
        } else if (window.ActiveXObject)
        {
            xmlobj = new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlobj.onreadystatechange = function ()
        {
            if (xmlobj.readyState == 4)
            {
                s1.innerHTML = xmlobj.responseText;
            }

        }//anonymous function
        xmlobj.open("post", "../User?pwd=" + x, true);
        xmlobj.send();

    }

}
function userPassword()
{
    flag = true;

    var s2 = document.getElementById("sp2");
    var s3 = document.getElementById("sp3");

    s2.innerHTML = "";
    s3.innerHTML = "";
    if (document.getElementById("txtNewPassword").value.length < 8) {
        s2.innerHTML = "Password should be atleast 8 character long !";
        flag = false;
    }

    if (document.getElementById("txtNewPassword").value != document.getElementById("txtConfirmNewPassword").value) {
        s3.innerHTML = "Password and Confirm Password do not match !";
        flag = false;
    }

    return flag;
}
