<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuarios</title>
</head>
<body>


	<h1>Creacion de Usuarios</h1>
	<form action="CreateUser" method="post">
		<label>Nombres</label>
		<input name="nombres" required>
		<br>
		<label>Apellidos</label>
		<input name="apellidos" required>
		<br>
		<label>Cedula</label>
		<input name="cedula" required>
		<br>
		<label>Direccion</label>
		<input name="direccion" required>
		<br>
		<label>Telefono</label>
		<input name="telefono" required>
		<br>
		<label>Correo</label>
		<input name="correo" required>
		<br>
		<label>Rol</label>
		<select name="rol" required>
			<option value="Doctor">Doctor</option>
			<option value="Secretaria">Secretaria</option>
		</select>
		<br>
		<label>Password</label>
		<input name="password" required>
		
		<br>
		<input type="submit" value="Crear Usuario">
	</form>
	

</body>
</html>