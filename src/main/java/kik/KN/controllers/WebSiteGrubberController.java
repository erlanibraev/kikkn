package kik.KN.controllers;

import kik.KN.service.IWebSiteGrubber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Создал Ибраев Ерлан 04.01.17.
 */
@RestController
@RequestMapping(value = "/grub/kn")
public class WebSiteGrubberController {

    private IWebSiteGrubber webSiteGrubber;

    @RequestMapping(value="", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void grub() {
        webSiteGrubber.grub();
    }

    @Autowired
    public void setWebSiteGrubber(IWebSiteGrubber webSiteGrubber) {
        this.webSiteGrubber = webSiteGrubber;
    }
}
