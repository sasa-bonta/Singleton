<?php



interface Image
{
    public function getWidth();
    public function getHeight();
    public function getPath();
    /**
     * @return string   the image's byte stream
     */
    public function dump();
}