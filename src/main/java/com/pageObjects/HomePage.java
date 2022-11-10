package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage(WebDriver rdriver) {
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(partialLinkText = "A/B")
    WebElement A_by_B;

    public WebElement A_by_B() {
        return A_by_B;
    }

    @FindBy(partialLinkText = "Add/Remove")
    WebElement Add_or_Remove;

    public WebElement Add_or_Remove() {
        return Add_or_Remove;
    }

    @FindBy(css = "a[href*='basic_auth']")
    WebElement auth;

    public WebElement auth() {
        return auth;
    }

    @FindBy(css = "a[href*='broken_images']")
    WebElement brokenImages;

    public WebElement brokenImages() {
        return brokenImages;
    }

    @FindBy(css = "a[href*='challenging_dom']")
    WebElement challengingDOM;

    public WebElement challengingDOM() {
        return challengingDOM;
    }

    @FindBy(css = "a[href*='checkboxes']")
    WebElement checkBox;

    public WebElement checkBox() {
        return checkBox;
    }

    @FindBy(css = "a[href*='context_menu']")
    WebElement contextMenu;

    public WebElement contextMenu() {
        return contextMenu;
    }

    @FindBy(css = "a[href*='digest_auth']")
    WebElement digestAuth;

    public WebElement digestAuth() {
        return digestAuth;
    }

    @FindBy(css = "a[href*='disappearing_elements']")
    WebElement disappearingElements;

    public WebElement disappearingElements() {
        return disappearingElements;
    }

    @FindBy(css = "a[href*='drag_and_drop']")
    WebElement drag_and_drop;

    public WebElement drag_and_drop() {
        return drag_and_drop;
    }

    @FindBy(css = "a[href*='dropdown']")
    WebElement dropdown;

    public WebElement dropdown() {
        return dropdown;
    }

    @FindBy(css = "a[href*='dynamic_content']")
    WebElement dynamic_content;

    public WebElement dynamic_content() {
        return dynamic_content;
    }

    @FindBy(css = "a[href*='dynamic_controls']")
    WebElement dynamic_controls;

    public WebElement dynamic_controls() {
        return dynamic_controls;
    }

    @FindBy(css = "a[href*='dynamic_loading']")
    WebElement dynamic_loading;

    public WebElement dynamic_loading() {
        return dynamic_loading;
    }

    @FindBy(css = "a[href*='entry_ad']")
    WebElement entry_ad;

    public WebElement entry_ad() {
        return entry_ad;
    }

    @FindBy(css = "a[href*='exit_intent']")
    WebElement exit_intent;

    public WebElement exit_intent() {
        return exit_intent;
    }

    @FindBy(linkText = "File Download")
    WebElement file_download;

    public WebElement file_download() {
        return file_download;
    }

    @FindBy(css = "a[href*='upload']")
    WebElement upload;

    public WebElement upload() {
        return upload;
    }

    @FindBy(css = "a[href*='floating_menu']")
    WebElement floating_menu;

    public WebElement floating_menu() {
        return floating_menu;
    }

    @FindBy(css = "a[href*='forgot_password']")
    WebElement forgot_password;

    public WebElement forgot_password() {
        return forgot_password;
    }

    @FindBy(css = "a[href*='login']")
    WebElement form_authentication;

    public WebElement form_authentication() {
        return form_authentication;
    }

    @FindBy(linkText = "Frames")
    WebElement frames;

    public WebElement frames() {
        return frames;
    }

    @FindBy(css = "a[href*='geolocation']")
    WebElement geolocation;

    public WebElement geolocation() {
        return geolocation;
    }

    @FindBy(css = "a[href*='horizontal_slider']")
    WebElement horizontal_slider;

    public WebElement horizontal_slider() {
        return horizontal_slider;
    }

    @FindBy(css = "a[href*='hovers']")
    WebElement hovers;

    public WebElement hovers() {
        return hovers;
    }

    @FindBy(css = "a[href*='infinite_scroll']")
    WebElement infinite_scroll;

    public WebElement infinite_scroll() {
        return infinite_scroll;
    }


    @FindBy(css = "a[href*='inputs']")
    WebElement inputs;

    public WebElement inputs() {
        return inputs;
    }

    @FindBy(linkText = "JQuery UI Menus")
    WebElement jquery;

    public WebElement jquery() {
        return jquery;
    }

    @FindBy(css = "a[href*='javascript_alerts']")
    WebElement javascript_alerts;

    public WebElement javascript_alerts() {
        return javascript_alerts;
    }

    @FindBy(css = "a[href*='javascript_error']")
    WebElement javascript_error;

    public WebElement javascript_error() {
        return javascript_error;
    }

    @FindBy(css = "a[href*='key_presses']")
    WebElement key_presses;

    public WebElement key_presses() {
        return key_presses;
    }

    @FindBy(css = "a[href*='large']")
    WebElement largeDeepDOM;

    public WebElement largeDeepDOM() {
        return largeDeepDOM;
    }

    @FindBy(css = "a[href*='windows']")
    WebElement windows;

    public WebElement windows() {
        return windows;
    }

    @FindBy(linkText = "Nested Frames")
    WebElement nestedFrames;

    public WebElement nestedFrames() {
        return nestedFrames;
    }

    @FindBy(css = "a[href*='notification_message']")
    WebElement notification_message;

    public WebElement notification_message() {
        return notification_message;
    }

    @FindBy(css = "a[href*='redirector']")
    WebElement redirectLink;

    public WebElement redirectLink() {
        return redirectLink;
    }

    @FindBy(css = "a[href*='download_secure']")
    WebElement secureFileDownload;

    public WebElement secureFileDownload() {
        return secureFileDownload;
    }

    @FindBy(css = "a[href*='shadowdom']")
    WebElement shadowDOM;

    public WebElement shadowDOM() {
        return shadowDOM;
    }

    @FindBy(css = "a[href*='shifting_content']")
    WebElement shiftingContent;

    public WebElement shiftingContent() {
        return shiftingContent;
    }

    @FindBy(css = "a[href*='slow']")
    WebElement slowResources;

    public WebElement slowResources() {
        return slowResources;
    }

    @FindBy(css = "a[href*='tables']")
    WebElement sortableDataTables;

    public WebElement sortableDataTables() {
        return sortableDataTables;
    }

    @FindBy(css = "a[href*='status_codes']")
    WebElement statusCodes;

    public WebElement statusCodes() {
        return statusCodes;
    }

    @FindBy(css = "a[href*='typos']")
    WebElement typos;

    public WebElement typos() {
        return typos;
    }

    @FindBy(css = "a[href*='tinymce']")
    WebElement WYSIWYG_Editor;

    public WebElement WYSIWYG_Editor() {
        return WYSIWYG_Editor;
    }
}
