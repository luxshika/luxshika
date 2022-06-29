<html>
<head>
<title>Thank You</title>
</head>
<body>
<h1>Thank you <h1>
<p>Thank you for registering .Here is the information you submitted.</p>
<table border=1; style = "border_collapse:collapse;">
 <tr><td>First name:</td><td><!-- echo firstname --><?php echo $_POST["fname"]; ?></td></tr>
  <tr><td>Last name:</td><td><!-- echo lastname --><?php echo $_POST["lname"]; ?></td></tr>
   <tr><td>Gender</td><td><!-- echo gender--><?php echo $_POST["gender"] ;?></td></tr>
   <tr><td>Following course</td><td><!-- echo course--><?php echo $_POST["course"] ;?></td></tr>
   </table>
   </body>
   </html>
   
   

   