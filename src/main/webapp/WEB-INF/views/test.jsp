<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<link href="resources/css/test.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/js/knockout-3.4.2.js"></script>
<script type="text/javascript" src="resources/js/test.js"></script>
<title>Hello Spring Framework</title>
</head>
<body>
	<div data-bind="foreach: member">
		<div>
			<!-- ko component: {
				name: 'test',
				params: {
				    name : name,
				    number : number
				}
			} -->
			<!-- /ko -->
		</div>
	</div>
</body>
</html>