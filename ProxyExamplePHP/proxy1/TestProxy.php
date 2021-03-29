<?php
/*
 *
 * Image - Subject interface.
 * Client depends only on this abstraction.
 *
 *
 * AbstractImage - Abstract class to avoid repetition of boilerplate code in the Proxy
 * and in the Subject. Only the methods which can be provided without
 * instancing the RealSubject are present here.
 *
 *
 * RealImage - The RealSubject. Always loads the image, even if no dump of the data
 * is required.
 *
 * ProxyImage - Proxy. Defers loading the image data until it becomes really mandatory.
 * This class does its best to postpone the very expensive operations
 * such as the actual loading of the BLOB.
 *
 *
 * _lazyLoad -Creates a RealImage and exploits its functionalities.
 *
 * User - User class that does not use the data dump of the image.
 * Passing blindly a Proxy to this class and to other Clients makes sense
 * as the data would be loaded anyway when Image::dump() is called.
 */

include_once('User.php');
include_once('RealImage.php');
include_once('ProxyImage.php');

$path = '/home/abonta/Downloads/photo.jpg';
$user = new User();

$image = new RealImage($path); // loading of the BLOB takes place
echo $user->tag($image), "\n";

$proxy = new ProxyImage($path);
echo $user->tag($proxy), "\n"; // loading does not take place even here

print mb_strlen($image->dump()) ."\n";
print mb_strlen($proxy->dump());