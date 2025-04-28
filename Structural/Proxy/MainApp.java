package Structural.Proxy;

import Structural.Proxy.example.internet.Internet;
import Structural.Proxy.example.internet.ProxyInternet;
import Structural.Proxy.example.video.ProxyVideoDownloader;
import Structural.Proxy.example.video.VideoDownloader;
public class MainApp {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");

    }

}
/*
 Le Proxy Pattern est un modèle structurel qui fournit un objet représentant un autre objet 
 pour contrôler l'accès à celui-ci. En Java, il est utilisé pour ajouter des fonctionnalités
comme la sécurité, la gestion de ressources ou la paresse d'initialisation sans changer l'objet réel.


Interface (Subject) → définit l'interface commune pour le proxy et l'objet réel.
Classe concrète (RealSubject) → l'objet réel qui fait le vrai travail.
Classe (Proxy) → contrôle l'accès à RealSubject et peut ajouter des comportements supplémentaires avant ou après l’appel.
 */