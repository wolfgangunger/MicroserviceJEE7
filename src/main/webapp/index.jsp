<%-- 
    Document   : index
    Created on : 14.09.2017, 09:16:37
    Author     : UNGERW
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JEE7 API</title>
        <link href='webjars/swagger-ui/2.1.8-M1/css/typography.css' media='screen' rel='stylesheet' type='text/css'/>
        <link href='webjars/swagger-ui/2.1.8-M1/css/reset.css' media='screen' rel='stylesheet' type='text/css'/>
        <link href='webjars/swagger-ui/2.1.8-M1/css/screen.css' media='screen' rel='stylesheet' type='text/css'/>
        <link href='webjars/swagger-ui/2.1.8-M1/css/reset.css' media='print' rel='stylesheet' type='text/css'/>
        <link href='webjars/swagger-ui/2.1.8-M1/css/screen.css' media='print' rel='stylesheet' type='text/css'/>
    <script src="webjars/swagger-ui/2.1.8-M1/lib/shred.bundle.js" type="text/javascript"></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/jquery-1.8.0.min.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/jquery.slideto.min.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/jquery.wiggle.min.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/jquery.ba-bbq.min.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/handlebars-2.0.0.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/underscore-min.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/backbone-min.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/swagger-client.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/swagger-ui.min.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/highlight.7.3.pack.js' type='text/javascript'></script>
    <script src='webjars/swagger-ui/2.1.8-M1/lib/marked.js' type='text/javascript'></script>
</head>
 
<body class="swagger-section">
        <h1>JEE7 (CA4) example. Micro Service and REST </h1>
<div id="message-bar" class="swagger-ui-wrap">&nbsp;</div>
<div id="swagger-ui-container" class="swagger-ui-wrap"></div>
<script type="text/javascript">
    $(function () {
        new SwaggerUi({
            url: '<%= application.getContextPath() %>/api/v1',
            dom_id: 'swagger-ui-container',
            swaggerRequstHeaders: 'application/json', // if you don't want to use it add .json to the url
            sorter: 'alpha'
        }).load();
    });
</script>
</body>
</html>