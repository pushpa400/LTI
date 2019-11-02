<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CM Registration</title>
</head>
<body>
<%@include file='menu.jsp' %>
<center><h1>Registration</h1>
<Form action="RegisterCM" name="Registration Form" method="post">
            <table>
                <tr>
                    <th> CM id:</th>
                    <td> <input type="text" name='cid' id="cid"></input>
                    </td>
                </tr>
                <tr>
                    <th> CM Name:</th>
                    <td> <input type="text" name='cname' id="cname"></input>
                    </td>
                </tr>
                <tr>
                        <th> Qualification: </th>
                        <td> <select name="qcategory" id="qcategory">
                        <option value='-1'>Select Category</option>
                        <option value='B.E./B.Tech'>B.E./B.Tech</option>
                        <option value='B.Com'>B.com</option>
                        <option value='12'>Class 12</option>
                        <option value='10'>Class 10</option>
                        </select>
                        </td>
                </tr>
                <tr>
                        <th> State: </th>
                        <td> <select name="scategory" id="scategory">
                        <option value='-1'>Select Category</option>
                        <option value='Maharashtra'>Maharashtra</option>
                        <option value='Gujarat'>Gujarat</option>
                        <option value='Bihar'>Bihar</option>
                        <option value='Kolkata'>Kolkata</option>
                        <option value='Jammu'>Jammu</option>
                        <option value='Andra Pradesh'>Andra Pradesh</option>
                        <option value='Delhi'>Delhi</option>
                        <option value='Goa'>Goa</option>
                        <option value='Haryana'>Haryana</option>
                        <option value='Madhya Pradesh'>Madhya Pradesh</option>
                        </select>
                        </td>
                </tr>
                <tr>
                        <th> End Date: </th>
                        <td> <input type="date"  name='edate'  id="edate"></input>
                        </td>
                </tr>
                <tr>
                        <th> Party: </th>
                        <td> <input type="text"  name='party'  id="party"></input>
                        </td>
                </tr>
                <tr>
                        <th colspan="2">
                        <input type="submit"  value='Make registration'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="reset" value='Clear'>
                        </th>
                </tr>
            </table>
    </Form></center>
</body>
</html>