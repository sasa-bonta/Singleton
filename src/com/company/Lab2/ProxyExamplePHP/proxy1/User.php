<?php

class User
{
    public function tag(Image $img)
    {
        return '<img src="' . $img->getPath() . '" alt="" width="'
            . $img->getWidth() . '" height="'
            . $img->getHeight() . '" />';
    }
}