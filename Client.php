<?php
 function arrayCastRecursive($array)
 {
     if (is_array($array)) {
         foreach ($array as $key => $value) {
             if (is_array($value)) {
                 $array[$key] = arrayCastRecursive($value);
             }
             if ($value instanceof stdClass) {
                 $array[$key] = arrayCastRecursive((array)$value);
             }
         }
     }
     if ($array instanceof stdClass) {
         return arrayCastRecursive((array)$array);
     }
     return $array;
 }
    $client = new SoapClient("http://localhost:8686/LivreWS?wsdl");
    if(isset($_GET['idd'])){
    $id_liv = $_GET['idd'];
    $param = new stdClass();
    $param->id = strval($id_liv);
     $rep = $client->__soapCall("deleteLivre",array($param));
     header('Location: Client.php');  
   
 
}
 
 $rslt2= $client->__soapCall("getLivres",array());
 $rslt =  arrayCastRecursive($rslt2); 
//print_r($rslt);
  ?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Document</title>
</head>
<body>
<div class="container">
    <form action="" method="post">
    <table class="table table-striped">
    <thead>
        <tr>
        <th scope="col">IDentifiant</th>
        <th scope="col">Titre</th>
        <th scope="col">Prix</th>
        <th scope="col">Auteurs</th>
        <th scope="col">Operation</th>

         </tr>
    </thead>
    <tbody>   
        <?php if (isset($rslt)){?>
            
         <?php 
         // var_dump($rslt);
         foreach($rslt as $val) {

             foreach($val as $row){
               // print_r($row);
                 if(is_array($row) ) {
?>
   <tr>
        <th scope="row"><?php echo($row['id']); ?></th>
        <td><?php  echo($row['titre']);?></td>
        <td><?php  echo($row['prix']);?></td>
        <td>
        <ul>
            <?php  
                foreach($row['auteur'] as $row3){
                    ?>
                   
                        <li> <?php  echo($row3['nom']); echo(" "); echo($row3['prenom']);?>   </li>    
                   
                    <?php 
                }
            ?>
        </ul>    
        </td>
        <td><a  class ="btn btn-danger"href="Client.php?idd=<?php  echo($row['id']); ?>" >supprimer</a></td>
    </tr>
<?php
                 }else{

?>
<tr>
        <th scope="row"><?php echo($val['id']); ?></th>
        <td><?php  echo($val['titre']);?></td>
        <td><?php  echo($val['prix']);?></td>
        <td> 
        <ul>
            <?php            
                foreach($val['auteur'] as $row3){
                    ?>
                        <li> <?php  echo($row3['nom']); echo(" "); echo($row3['prenom']);?>   </li>    
                    <?php 
                }
            ?>
        </ul>  

        </td>
        <td><a  class ="btn btn-danger"href="Client.php?idd=<?php  echo($val['id']); ?>" >supprimer</a></td>
        </tr>
            <?php

                    break;
                 }}}}
           ?>
    </tbody>
    </table>
    </form>
 </div>
</body>
</html>