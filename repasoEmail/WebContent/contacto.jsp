<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/estilo.css" rel="stylesheet"/>
<title>Contactanos</title>
</head>
<body>
<form action="contactoservlet" method="post" id="form_contacto" runat="server">
</br><h2>Contactos</h2><span class="required_notificacion">*Datos requeridos</span>
</br>Nombre:<input type="text" name="nombre" placeholder="Johana Cristancho"  required/>
</br>Email:<input type="email" name="email" placeholder="info@dominio.com" required/><span>Formato Correcto: "name@dominio.com"</span>
</br>Sitio Web:<input type="url" name="sitio_web" placeholder="http://dominio.com" required/><span>Formato Correcto: "http://dominio.com"</span>
</br>Mensaje:<textarea name="mensaje" rows="6" cols="40" name="message"> </textarea>
</br> <button type="submit">Enviar Formulario</button>
</form>
</body>
</html>