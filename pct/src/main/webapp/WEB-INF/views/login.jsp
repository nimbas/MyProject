<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<c:set value="${pageContext.request.locale.language}" var="lang" scope="session" />
<!DOCTYPE html>
<html lang="${lang }" id="extr-page">
<head>
<meta charset="utf-8">
<title>PS CUBE</title>
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- #CSS Links -->
<!-- Basic Styles -->
<s:url value="/resources/bootstrap/css" var="BOOT_CSS" />
<s:url value="/resources/bootstrap/img" var="BOOT_IMG" />
<s:url value="/resources//images" var="IMG" />
<s:url value="/resources/bootstrap/js" var="BOOT_JS" />

<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_CSS}/bootstrap.min.css">
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_CSS}/font-awesome.min.css">

<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_CSS}/smartadmin-production-plugins.min.css">
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_CSS}/smartadmin-production.min.css">
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_CSS}/smartadmin-skins.min.css">

<!-- SmartAdmin RTL Support -->
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_CSS}/smartadmin-rtl.min.css">

<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_CSS}/demo.min.css">

<!-- #FAVICONS -->
<link rel="shortcut icon" href="${BOOT_IMG}/favicon/favicon.ico" type="image/x-icon">
<link rel="icon" href="${BOOT_IMG}/favicon/favicon.ico" type="image/x-icon">

<!-- #GOOGLE FONT -->
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

<!-- #APP SCREEN / ICONS -->
<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
<link rel="apple-touch-icon" href="${BOOT_IMG}/splash/sptouch-icon-iphone.png">
<link rel="apple-touch-icon" sizes="76x76" href="${BOOT_IMG}/splash/touch-icon-ipad.png">
<link rel="apple-touch-icon" sizes="120x120" href="${BOOT_IMG}/splash/touch-icon-iphone-retina.png">
<link rel="apple-touch-icon" sizes="152x152" href="${BOOT_IMG}/splash/touch-icon-ipad-retina.png">

<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<!-- Startup image for web apps -->
<link rel="apple-touch-startup-image" href="${BOOT_IMG}/splash/ipad-landscape.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
<link rel="apple-touch-startup-image" href="${BOOT_IMG}/splash/ipad-portrait.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
<link rel="apple-touch-startup-image" href="${BOOT_IMG}/splash/iphone.png" media="screen and (max-device-width: 320px)">

</head>

<body class="animated fadeInDown">

	<header id="header">

		<div id="logo-group">
			<span id="logo"> <img src="${BOOT_IMG}/logo.png" alt="PS Cube">
			</span>
		</div>

	</header>

	<div id="main" role="main">

		<!-- MAIN CONTENT -->
		<div id="content" class="container" style="width:700px; margin-top:100px">

			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-5 col-lg-5 hidden-xs hidden-sm">
					<h1 class="txt-color-red login-header-big">&nbsp;</h1>
					<div class="">
						<img src="${IMG}/MainLogo.png" style="margin-top:-25px;" alt="" >
					</div>
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
							<!-- <h5 class="about-heading">About SmartAdmin - Are you up to date?</h5>
							<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa.</p> -->
						</div>
						<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
							<!-- <h5 class="about-heading">Not just your average template!</h5>
							<p>Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi voluptatem accusantium!</p> --> 
						</div>
					</div>

				</div>
				<div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
					<div class="well no-padding">
						<form method="POST" action="j_spring_security_check" id="login-form" class="smart-form client-form">
							<header> Sign In </header>

							<fieldset>

								<section>
									<label class="label">User Id</label> <label class="input"> <i class="icon-append fa fa-user"></i> <input type="text" name="j_username" value=""> <b
										class="tooltip tooltip-top-right"><i class="fa fa-user txt-color-teal"></i> Please enter user Id</b></label>
								</section>

								<section>
									<label class="label">Password</label> <label class="input"> <i class="icon-append fa fa-lock"></i> <input type="password" name="j_password" value="1"> <b
										class="tooltip tooltip-top-right"><i class="fa fa-lock txt-color-teal"></i> Enter your password</b>
									</label>
									<div class="note">
										<a href="javascrpt:void(0)">Forgot password?</a>
									</div>
								</section>

								<section>
									<label class="checkbox"> <input type="checkbox" name="remember" checked=""> <i></i>Stay signed in
									</label>
								</section>
							</fieldset>
							<footer>
								<button type="submit" class="btn btn-primary">Sign in</button>
							</footer>
						</form>

					</div>

				</div>
			</div>
		</div>

	</div>

	<!--================================================== -->

	<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
	<script src="${BOOT_JS}/plugin/pace/pace.min.js"></script>

	<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script>
		if (!window.jQuery) {
			document.write('<script src="${BOOT_JS}/libs/jquery-2.1.1.min.js"><\/script>');
		}
	</script>

	<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
	<script>
		if (!window.jQuery.ui) {
			document.write('<script src="${BOOT_JS}/libs/jquery-ui-1.10.3.min.js"><\/script>');
		}
	</script>

	<!-- IMPORTANT: APP CONFIG -->
	<script src="${BOOT_JS}/app.config.js"></script>

	<!-- JS TOUCH : include this plugin for mobile drag / drop touch events 		
		<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

	<!-- BOOTSTRAP JS -->
	<script src="${BOOT_JS}/bootstrap/bootstrap.min.js"></script>

	<!-- JQUERY VALIDATE -->
	<script src="${BOOT_JS}/plugin/jquery-validate/jquery.validate.min.js"></script>

	<!-- JQUERY MASKED INPUT -->
	<script src="${BOOT_JS}/plugin/masked-input/jquery.maskedinput.min.js"></script>

	<!--[if IE 8]>
			
			<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>
			
		<![endif]-->

	<!-- MAIN APP JS FILE -->
	<script src="${BOOT_JS}/app.js"></script>

	<script type="text/javascript">
		runAllForms();

		$(function() {
			// Validation
			$("#login-form").validate({
				// Rules for form validation
				rules: {
					userid: {
						required: true
					},
					password: {
						required: true,
						minlength: 2,
						maxlength: 20
					}
				},

				// Messages for form validation
				messages: {
					userid: {
						required: 'Please enter your Id',
					},
					password: {
						required: 'Please enter your password'
					}
				},

				// Do not change code below
				errorPlacement: function(error, element) {
					error.insertAfter(element.parent());
				}
			});
		});
	</script>

</body>
</html>