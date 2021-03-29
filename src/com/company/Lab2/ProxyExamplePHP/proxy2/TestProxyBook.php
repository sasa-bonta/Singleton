<?php

require_once('Book.php');
require_once('BookList.php');
require_once('ProxyBookList.php');

/*
 * In this example, the ProxyBookList is created in place of the more resource intensive BookList.
 * ProxyBookList will only instantiate BookList the first time a method in BookList is called.
 */

writeln( 'BEGIN TESTING PROXY PATTERN');
writeln('');

$proxyBookList = new ProxyBookList();
$inBook = new Book('What Every Body is Saying','Joe Navarro');
$proxyBookList->addBook($inBook);

writeln('test 1 - show the book count after a book is added');
writeln($proxyBookList->getBookCount());
writeln('');

writeln('test 2 - show the book');
$outBook = $proxyBookList->getBook(1);
writeln($outBook->getAuthorAndTitle());
writeln('');

$proxyBookList->removeBook($outBook);

writeln('test 3 - show the book count after a book is removed');
writeln($proxyBookList->getBookCount());
writeln('');

writeln('END TESTING PROXY PATTERN');

function writeln($line_in) {
    echo $line_in."\n";
}