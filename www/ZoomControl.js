
/**
 * Constructor
 */
function ZoomControl() {
};

ZoomControl.prototype.ZoomControl = function(boolean) {
    return cordova.exec(null, null, "ZoomControl", "ZoomControl", [boolean]);
};

/**
 * Load Plugin
 */

if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.ZoomControl) {
    window.plugins.ZoomControl = new ZoomControl();
}
