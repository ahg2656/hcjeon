<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="../css/board.css">
<script type="text/javascript">
window.onload = function() {
	
}
</script>
</head>
<body>
<table>
	<tr>
		<td>
		[<a href="../index.jsp">메인으로</a>]&nbsp;
		[<a href="../boardlist.jsp?page=1">최근목록</a>]&nbsp;
		[<a href="boardwrite.jsp">새글작성</a>]&nbsp;
		[<a href="#" onclick="window.open('admin.jsp','','width=300,height=150,top=200,left=300')">관리자용</a>]&nbsp;
		</td>
	</tr>
</table>
</body>
</html>