<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>[board_list.jsp]</title>
	<style type="text/css">
		b,input, textarea { font-size:15pt; font-weight:bold; font-family:'맑은고딕' ; }
		td { font-size:10pt; font-weight:bold; font-family:'맑은고딕'; height: 20; border-bottom-style: solid; border-bottom-width: 1;  }
		a { font-size:10pt; font-weight:bold; font-family:'맑은고딕'  }
		a:link { text-decoration:none; color:#333333; }
		a:visited { text-decoration:none; color:#333333; }
		a:active { text-decoration:none; color:#333333; }
		a:hover { text-decoration:underline; color:#333333; }
		tr, td { text-align:center }
	</style>
	
	<script language="JavaScript">

		function na_open_window(name, url, left, top, width, height, toolbar, menubar, statusbar, scrollbar, resizable)
		{
		  toolbar_str = toolbar ? 'yes' : 'no';
		  menubar_str = menubar ? 'yes' : 'no';
		  statusbar_str = statusbar ? 'yes' : 'no';
		  scrollbar_str = scrollbar ? 'yes' : 'no';
		  resizable_str = resizable ? 'yes' : 'no';
		  window.open(url, name, 'left='+left+',top='+top+',width='+width+',height='+height+',toolbar='+toolbar_str+',menubar='+menubar_str+',status='+statusbar_str+',scrollbars='+scrollbar_str+',resizable='+resizable_str);
		}


</script>
	
</head>
<body>
	<table style="width:800px; border:0.1em; border-style:solid; ">
		
		<tr height=30>
			<td colspan=5 align=center>
				<img src="./resources/img/board-top.jpg">
			
				<p><a href="javascript:na_open_window('win', 'board_insertform.do', 300, 200, 500, 510, 0, 0, 0, 0, 0)" target="_self">
				[CGV_자유게시판 글쓰기] &nbsp;&nbsp; </a></p>
				
				<br>
			</td>
			
		</tr>
		
		<tr bgcolor=skyblue height=30>
			<td width=100px>글번호</td><td width=500px>제목</td><td width=100px>작성자</td><td width=50px>취미</td><td width=50px>성별</td>
		</tr>
			
		<tr>	
			<td>${naver.hobby_idx}</td><td>${naver.title}</td><td>${naver.name} </td><td>${naver.hobby} </td><td>${naver.gender} </td>
		</tr>
		
		<tr height=30>
			<td colspan=5>내용</td>			
		</tr>
		<tr height=80>
			<td colspan=5> ${naver.content} </td>
		</tr>
			
		<tr>
		<td colspan=5>그림첨부</td>
		</tr>
		
		<tr height=50>			
			<td colspan=5> <img src= "upload/${naver.img_file_name}" width=200 height=200> </td>
		</tr>
	</table>
	
</body>
</html>




