<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- Bread crumb is created dynamically -->
<!-- row -->
<div class="row display-none">

	<!-- col -->
	<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
		<h1 class="page-title txt-color-blueDark"><!-- PAGE HEADER --><i class="fa-fw fa fa-home"></i> Page Header <span>>
			Subtitle </span></h1>
	</div>
	<!-- end col -->

	<!-- right side of the page with the sparkline graphs -->
	<!-- col -->
	<div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
		<!-- sparks -->
		<ul id="sparks">
			<li class="sparks-info">
				<h5> My Income <span class="txt-color-blue">$47,171</span></h5>
				<div class="sparkline txt-color-blue hidden-mobile hidden-md hidden-sm">
					1300, 1877, 2500, 2577, 2000, 2100, 3000, 2700, 3631, 2471, 2700, 3631, 2471
				</div>
			</li>
			<li class="sparks-info">
				<h5> Site Traffic <span class="txt-color-purple"><i class="fa fa-arrow-circle-up" data-rel="bootstrap-tooltip" title="Increased"></i>&nbsp;45%</span></h5>
				<div class="sparkline txt-color-purple hidden-mobile hidden-md hidden-sm">
					110,150,300,130,400,240,220,310,220,300, 270, 210
				</div>
			</li>
			<li class="sparks-info">
				<h5> Site Orders <span class="txt-color-greenDark"><i class="fa fa-shopping-cart"></i>&nbsp;2447</span></h5>
				<div class="sparkline txt-color-greenDark hidden-mobile hidden-md hidden-sm">
					110,150,300,130,400,240,220,310,220,300, 270, 210
				</div>
			</li>
		</ul>
		<!-- end sparks -->
	</div>
	<!-- end col -->

</div>
<!-- end row -->

<!-- row -->
<div class="row">

	<!-- NEW WIDGET START -->
	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

		<div id="property_map" class="" data-gmap-lat="26.995883" data-gmap-lng="-80.650630" data-gmap-zoom="8" data-gmap-src="xml/gmap/realestate.xml">
			test
		</div>
		
		<div id="property_settings">
			
		</div>
		
	</div>
	<!-- WIDGET END -->

</div>

<!-- end row -->

<!-- Dynamic Modal -->  
<div class="modal fade" id="remoteModal" tabindex="-1" role="dialog" aria-labelledby="remoteModalLabel" aria-hidden="true">  
    <div class="modal-dialog">  
        <div class="modal-content">
        	<!-- content will be filled here from "ajax/modal-content/model-content-1.html" -->
        </div>  
    </div>  
</div>  
<!-- /.modal -->

<script type="text/javascript">
	/* DO NOT REMOVE : GLOBAL FUNCTIONS!
	 *
	 * pageSetUp(); WILL CALL THE FOLLOWING FUNCTIONS
	 *
	 * // activate tooltips
	 * $("[rel=tooltip]").tooltip();
	 *
	 * // activate popovers
	 * $("[rel=popover]").popover();
	 *
	 * // activate popovers with hover states
	 * $("[rel=popover-hover]").popover({ trigger: "hover" });
	 *
	 * // activate inline charts
	 * runAllCharts();
	 *
	 * // setup widgets
	 * setup_widgets_desktop();
	 *
	 * // run form elements
	 * runAllForms();
	 *
	 ********************************
	 *
	 * pageSetUp() is needed whenever you load a page.
	 * It initializes and checks for all basic elements of the page
	 * and makes rendering easier.
	 *
	 */

	pageSetUp();

	/*
	* ALL PAGE RELATED SCRIPTS CAN GO BELOW HERE
	* eg alert("my home function");
	*
	* var pagefunction = function() {
	*   ...
	* }
	* loadScript("js/plugin/_PLUGIN_NAME_.js", pagefunction);
	*
	* TO LOAD A SCRIPT:
	* var pagefunction = function (){
	*  loadScript(".../plugin.js", run_after_loaded);
	* }
	*
	* OR you can load chain scripts by doing
	*
	* loadScript(".../plugin.js", function(){
	* 	 loadScript("../plugin.js", function(){
	* 	   ...
	*   })
	* });
	*/

	// pagefunction
	//var eachMarker;
	//var realestatemap;
	
	var pagefunction = function() {

		/*jslint smarttabs:true */
		var colorful_style = [{

			"featureType" : "landscape",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "transit",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "poi.park",
			"elementType" : "labels",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "poi.park",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"color" : "#d3d3d3"
			}, {
				"visibility" : "on"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "geometry.stroke",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "landscape",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#b1bc39"
			}]
		}, {
			"featureType" : "landscape.man_made",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#ebad02"
			}]
		}, {
			"featureType" : "water",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#416d9f"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "labels.text.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#000000"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "labels.text.stroke",
			"stylers" : [{
				"visibility" : "off"
			}, {
				"color" : "#ffffff"
			}]
		}, {
			"featureType" : "administrative",
			"elementType" : "labels.text.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#000000"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#ffffff"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "labels.icon",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "water",
			"elementType" : "labels",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "poi",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"color" : "#ebad02"
			}]
		}, {
			"featureType" : "poi.park",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"color" : "#8ca83c"
			}]
		}];

		// Retro
		var metro_style = [{
			"featureType" : "transit",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "poi.park",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"color" : "#d3d3d3"
			}, {
				"visibility" : "on"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "geometry.stroke",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "landscape",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#eee8ce"
			}]
		}, {
			"featureType" : "water",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#b8cec9"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "labels.text.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#000000"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "labels.text.stroke",
			"stylers" : [{
				"visibility" : "off"
			}, {
				"color" : "#ffffff"
			}]
		}, {
			"featureType" : "administrative",
			"elementType" : "labels.text.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#000000"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"visibility" : "on"
			}, {
				"color" : "#ffffff"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "geometry.stroke",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "road",
			"elementType" : "labels.icon",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "water",
			"elementType" : "labels",
			"stylers" : [{
				"visibility" : "off"
			}]
		}, {
			"featureType" : "poi",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"color" : "#d3cdab"
			}]
		}, {
			"featureType" : "poi.park",
			"elementType" : "geometry.fill",
			"stylers" : [{
				"color" : "#ced09d"
			}]
		}, {
			"featureType" : "poi",
			"elementType" : "labels",
			"stylers" : [{
				"visibility" : "off"
			}]
		}];

		/*
		 * Google Maps Initialize
		 */

		var map_object = $("#property_map");
		var zoom_level = (map_object.data("gmap-zoom") || 5);
		var data_lat = (map_object.data("gmap-lat") || 29.895883);
		var data_lng = (map_object.data("gmap-lng") || -80.650635);
		var xml_src = (map_object.data("gmap-src") || "xml/gmap/pin.xml");
		
		realestatemap = new google.maps.StyledMapType(metro_style, {
			name : "Metro"
		}), colorfulStyleMap = new google.maps.StyledMapType(colorful_style, {
			name : "Colorful"
		});

		function xmlLoadMap() {

			var centerLatLng = new google.maps.LatLng(data_lat, data_lng), mapOptions = {
				zoom : zoom_level,
				center : centerLatLng,
				//disableDefaultUI: true,
				//mapTypeId : google.maps.MapTypeId.ROADMAP
				mapTypeControlOptions : {
					mapTypeIds : [google.maps.MapTypeId.TERRAIN, 'colorful_style', 'metro_style']
				}
			}, bounds = new google.maps.LatLngBounds(), infowindow = new google.maps.InfoWindow(), map = new google.maps.Map(document.getElementById("property_map"), mapOptions);

			map.mapTypes.set('colorful_style', colorfulStyleMap);
			map.mapTypes.set('metro_style', realestatemap);

			//map.setMapTypeId(google.maps.MapTypeId.TERRAIN);
			map.setMapTypeId('metro_style');

			$.get(xml_src, function(data) {

				// create the Bounds object
				var bounds = new google.maps.LatLngBounds();

				$(data).find("marker").each(function() {

					var eachMarker = jQuery(this),
					// grab the address from XML
					theAddress = eachMarker.find("address").text(), mygc = new google.maps.Geocoder(theAddress);

					mygc.geocode({
						'address' : theAddress
					}, function(results, status) {

						var mLat = results[0].geometry.location.lat(), Long = results[0].geometry.location.lng(), marker = new google.maps.Marker({
							position : new google.maps.LatLng(mLat, Long),
							map : map,
							icon : ('img/' + eachMarker.find("icons").text() + '.png'),
							scrollwheel : false,
							streetViewControl : true,
							title : eachMarker.find("name").text()
						}), link = "link";

						google.maps.event.addListener(marker, 'click', function() {// click
							// Setting the content of the InfoWindow
							var contentString = '<div id="info-map" style="width:300px; height:85px; padding:0px;"><div>' + '<div style="display:inline-block; width:86px; verticle-align:top; float:left;"><img src=' + eachMarker.find("image").text() + ' class="thumbnail" style="width:80%; verticle-align:top;" /></div>' + '<div style="display:inline-block; width:200px; float:left;"><h4>' + eachMarker.find("name").text() + '</h4><b>' + eachMarker.find("address").text() + '</b><br/>' + '<p><a href="' + eachMarker.find("link").text() + '" data-toggle="modal" data-target="#remoteModal" class="btn btn-xs btn-default pull-right infowindow-link"><i class="fa fa-fw fa-map-marker"></i>More Info</a></p>' + '</div></div></div>';
							infowindow.setContent(contentString);
							infowindow.open(map, marker);
							link = null;
							
							google.maps.event.addListener(map, 'click', function() {
								infowindow.close();
								//link = null;
							})
						});

					});
					// end geocode

				});
				// end find marker loop

			});
			// end get data

		}// end xmlLoadMap

		// grey

		xmlLoadMap();
		
		// 
		// fix table height

			/*property_map();

			$(window).resize(function() {
				property_map()
			});*/
			
			function property_map() {

				if ($('body').hasClass('menu-on-top')) {
					var menuHeight = 68;
					// nav height

					var property_map = ($(window).height() - 140) - menuHeight;
					
					if (property_map < (320 - menuHeight)) {
						map_object.css('height', (320 - menuHeight) + 'px');
					} else {
						map_object.css('height', property_map + 'px');
					}

					//google.maps.event.trigger(realestatemap, 'resize')

				} else {
					var property_map = $(window).height() - 140;
					if (property_map < 320) {
						map_object.css('height', 320 + 'px');
					} else {
						map_object.css('height', property_map + 'px');
					}

					//google.maps.event.trigger(realestatemap, 'resize')

				}

			} // end property_map();

	};

	// end pagefunction

	// destroy generated instances
	// pagedestroy is called automatically before loading a new page
	// only usable in AJAX version!

	var pagedestroy = function() {

		/*
		Example below:

		$("#calednar").fullCalendar( 'destroy' );
		if (debugState){
		root.console.log("✔ Calendar destroyed");
		}

		For common instances, such as Jarviswidgets, Google maps, and Datatables, are automatically destroyed through the app.js loadURL mechanic

		*/
		//$(window).unbind('gMapsLoaded');

		$("#property_map").remove();

		if (debugState) {
			root.console.log("✔ Google maps unbind");
		}

	}
	// end destroy

	// run pagefunction on load

	$(window).unbind('gMapsLoaded');
	$(window).bind('gMapsLoaded', pagefunction);
	window.loadGoogleMaps();

</script>
