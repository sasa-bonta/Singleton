<?php


class ProxyImage extends AbstractImage
{
    private $_realImage;

    public function __construct($path)
    {
        $this->_path = $path;
        list ($this->_width, $this->_height) = getimagesize($path);
    }

    /**
     * Creates a RawImage and exploits its functionalities.
     */
    protected function _lazyLoad()
    {
        if ($this->_realImage === null) {
            $this->_realImage = new RealImage($this->_path);
        }
    }

    public function dump()
    {
        $this->_lazyLoad();
        return $this->_realImage->dump();
    }
}