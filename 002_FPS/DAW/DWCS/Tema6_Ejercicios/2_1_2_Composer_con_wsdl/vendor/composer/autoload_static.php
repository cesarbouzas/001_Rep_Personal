<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit903ebd4eebb6616d8c1671311207e2b0
{
    public static $files = array (
        'def43f6c87e4f8dfd0c9e1b1bab14fe8' => __DIR__ . '/..' . '/symfony/polyfill-iconv/bootstrap.php',
    );

    public static $prefixLengthsPsr4 = array (
        'W' => 
        array (
            'Wsdl2PhpGenerator\\' => 18,
        ),
        'S' => 
        array (
            'Symfony\\Polyfill\\Iconv\\' => 23,
            'Symfony\\Component\\OptionsResolver\\' => 34,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Wsdl2PhpGenerator\\' => 
        array (
            0 => __DIR__ . '/..' . '/wsdl2phpgenerator/wsdl2phpgenerator/src',
            1 => __DIR__ . '/..' . '/wsdl2phpgenerator/wsdl2phpgenerator/lib',
        ),
        'Symfony\\Polyfill\\Iconv\\' => 
        array (
            0 => __DIR__ . '/..' . '/symfony/polyfill-iconv',
        ),
        'Symfony\\Component\\OptionsResolver\\' => 
        array (
            0 => __DIR__ . '/..' . '/symfony/options-resolver',
        ),
    );

    public static $classMap = array (
        'Composer\\InstalledVersions' => __DIR__ . '/..' . '/composer/InstalledVersions.php',
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit903ebd4eebb6616d8c1671311207e2b0::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit903ebd4eebb6616d8c1671311207e2b0::$prefixDirsPsr4;
            $loader->classMap = ComposerStaticInit903ebd4eebb6616d8c1671311207e2b0::$classMap;

        }, null, ClassLoader::class);
    }
}