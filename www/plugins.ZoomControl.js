// creating plugin
var exec = require("cordova/exec");

function ZoomControl() {};

ZoomControl.prototype.ZoomControl = function(enabled) {
	exec(null, function(error){
		alert("Error calling ZoomControl::ZoomControl:"+error);
	}, "ZoomControl", "ZoomControl", [enabled]);
};
ZoomControl.prototype.setBuiltInZoomControls = function(enabled) {
	exec(null, function(error){
		alert("Error calling ZoomControl::setBuiltInZoomControls:"+error);
	}, "ZoomControl", "setBuiltInZoomControls", [enabled]);
};

var ZoomControl = new ZoomControl();
module.exports = ZoomControl;
