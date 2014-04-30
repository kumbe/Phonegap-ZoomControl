Phonegap-ZoomControl
====================

Plugin for enable the native zoom control on phonegap

Usage example
====================

```html
  <!DOCTYPE html>
  <!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
  <!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
  <!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
  <!--[if gt IE 8]><!-->
  <html class="no-js">
  <!--<![endif]-->
  <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Test</title>

  <meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=2">
  <meta name="apple-mobile-web-app-capable" content="yes" />
  <script type="text/javascript">
 
   function OnLoad(){
  	 document.addEventListener('deviceready', function(){
  	 	//enabling zoom control
  		 cordova.plugins.ZoomControl.ZoomControl("true");
  		 // enabling built in zoom control
  		 cordova.plugins.ZoomControl.setBuiltInZoomControls("true");
  		 // enabling display zoom control
  		 cordova.plugins.ZoomControl.setDisplayZoomControls("true");
  		 
  	 }, function(){
  		 alert('error deviceready');
  	 });
  	 
   }
  	</script>

  </head>
  <body onload="OnLoad();">
  	<h1>Test Zoom</h1>
  
  </body>
  </html>
```
