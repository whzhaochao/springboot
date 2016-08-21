<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
FreeMarker模板引擎
<h1>${host}</h1>
<#list users as user>
   ${user.id}-->${user.name}<br>
</#list>

<img src="1.jpg">

</body>
</html>
