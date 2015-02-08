<?php

    $aan = "info@jfbmicalculator.nl";
    $van = $_REQUEST['naam'];
    $onderwerp = $_REQUEST['onderwerp'];
    $naam = $_REQUEST['naam'];
    $headers = "Van: $van";

    $fields = array();
    $fields{"naam"} = "naam";
    $fields{"email"} = "email";
    $fields{"onderwerp"} = "onderwerp";
    $fields{"bericht"} = "bericht";

    $body = "Dit bericht is verstuurd:\n\n"; foreach($fields as $a => $b){   $body .= sprintf("%20s: %s\n",$b,$_REQUEST[$a]); }

    $send = mail($aan, $onderwerp, $body, $headers);

?>
