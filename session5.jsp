<%@ page import="java.io.*,java.util.*" %>
 <%
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		// Calculate active duration
	    long activeSeconds = (session.getLastAccessedTime() - session.getCreationTime()) / 1000;
	    long minutes = activeSeconds / 60;
	    long seconds = activeSeconds % 60;
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%
		String uname=request.getParameter("usn");
		out.print("Hello " + uname);
		//HttpSession session = request.getSession();
		//session.invalidate();
%>
<h1>Session Tracking example</h1>
</center>
</center>
<table border="1" align="center">
<tr bgcolor="#ffddd">
<th>Session info</th>
<th>Value</th>
</tr>
<tr >
<td>id</td>
<td><% out.print( session.getId()); %></td>
</tr>
<tr>
<td>Creation Time</td>
<td><% out.print(createTime); %></td>
</tr>
<tr>
<td>Time of Last Access</td>
<td><% out.print(lastAccessTime); %></td>
</tr>
<tr>
    <td>Active Duration</td>
    <td><%= minutes %> minutes <%= seconds %> seconds</td>
</tr>
</table>	
</body>
</html>