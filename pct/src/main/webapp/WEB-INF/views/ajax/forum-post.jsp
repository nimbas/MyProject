<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- Bread crumb is created dynamically -->
<!-- row -->
<div class="row">

	<!-- col -->
	<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
		<h1 class="page-title txt-color-blueDark"><!-- PAGE HEADER --><i class="fa-fw fa fa-file-o"></i> Forum Layout<span>>
			Post View </span></h1>
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

<!--
The ID "widget-grid" will start to initialize all widgets below
You do not need to use widgets if you dont want to. Simply remove
the <section></section> and you can use wells or panels instead
-->

<!-- row -->
<div class="row">

	<div class="col-sm-12">

		<div class="well">

			<table class="table table-striped table-forum">
				<thead>
                    <tr>
                        <th colspan="2">
                        	<a href="#ajax/forum.html"> Projects </a> > <a href="#ajax/forum-topic.html">Business Requirement Docs </a> > Nam quam nunc blandit vel
                        </th>
                    </tr>
                </thead>
				<tbody>
					<!-- Post -->
					<tr>
                        <td class="text-center">
                        	<a href="#ajax/profile.html"><img src="img/blank.gif" class="flag flag-us" alt="United States"> &nbsp; 
                        	<strong>John Doe</strong></a>
                        </td>
                        <td>on <em>Jan 1, 2014 - 12:00am</em></td>
                    </tr>		
					<tr>
                        <td class="text-center" style="width: 12%;">
                            <div class="push-bit">
                                <a href="#ajax/profile.html">
                                    <img src="img/avatars/sunny.png" width="50" alt="avatar" class="online">
                                </a>
                            </div>
                            <small>473 Posts</small>
                        </td>
                        <td>
                            <p>
                            
                             Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet.	
                            </p>
                            
                            <h5>Forecast Pie</h5>
							<span class="sparkline display-inline margin-bottom-10" data-sparkline-type="pie" data-sparkline-offset="90" data-sparkline-piesize="150px">
								33,20,10
							</span>
							
							<p>
								Fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viv.
							</p>
							
							<em>- John Doe <br> CEO, SmartAdmin</em>
                        </td>
                    </tr>				
					<!-- end Post -->

					<!-- Post -->
					<tr>
                        <td class="text-center">
                        	<a href="#ajax/profile.html"><img src="img/blank.gif" class="flag flag-fr" alt="France"> &nbsp; 
                        	<strong>Sadi Orlaf</strong></a>
                        </td>
                        <td>on <em>Jan 1, 2014 - 12:00am</em></td>
                    </tr>		
					<tr>
                        <td class="text-center" style="width: 12%;">
                            <div class="push-bit">
                                <a href="#ajax/profile.html">
                                    <img src="img/avatars/5.png" width="50" alt="avatar" class="offline">
                                </a>
                            </div>
                            <small>473 Posts</small>
                        </td>
                        <td>
                            <p>
                            
                             Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet.	
                            </p>
							
							<em>- Sadi Orlaf <br> Executive, SmartAdmin</em>
							
							<div class="forum-attachment">
								2 attachment(s) — <a href="javascript:void(0);"> Download all attachments</a> 
								<ul class="list-inline margin-top-10">
									<li class="well well-sm padding-5">
											<strong>rocketlaunch.jpg</strong> 
											<br>
											400 kb 
											<br> 
											<a href="javascript:void(0);"> Download</a>  | <a href="javascript:void(0);"> View</a>
									</li>
									<li class="well well-sm padding-5">
											<strong>budget.xsl</strong> 
											<br>
											400 kb 
											<br> 
											<a href="javascript:void(0);"> Download</a>  | <a href="javascript:void(0);"> Share</a>
									</li>
								</ul>
							</div>
							
                        </td>
                    </tr>				
					<!-- end Post -->

					<!-- Post -->
					<tr>
                        <td class="text-center">
                        	<a href="#ajax/profile.html"><img src="img/blank.gif" class="flag flag-us" alt="United States"> &nbsp; 
                        	<strong>Me</strong></a>
                        </td>
                        <td><em>Today</em></td>
                    </tr>		
					<tr>
                        <td class="text-center" style="width: 12%;">
                            <div class="push-bit">
                                <a href="#ajax/profile.html">
                                    <img src="img/avatars/sunny.png" width="50" alt="avatar" class="online">
                                </a>
                            </div>
                            <small>473 Posts</small>
                        </td>
                        <td>

                        	<div id="forumPost"></div>
                			<button class="btn btn-primary margin-top-10">Post</button>
                			<button class="btn btn-success margin-top-10">Save for later</button>
						
                        </td>
                    </tr>				
					<!-- end Post -->
					
				</tbody>
			</table>

			<div class="text-center">
                <ul class="pagination pagination-sm">
                    <li class="disabled"><a href="javascript:void(0);">Prev</a></li>
                    <li class="active"><a href="javascript:void(0);">1</a></li>
                    <li><a href="javascript:void(0);">2</a></li>
                    <li><a href="javascript:void(0);">3</a></li>
                    <li><a href="javascript:void(0);">...</a></li>
                    <li><a href="javascript:void(0);">99</a></li>
                    <li><a href="javascript:void(0);">Next</a></li>
                </ul>
            </div>

		</div>
	</div>

</div>

<!-- end row -->

<!-- row -->

<div class="row">

	<!-- a blank row to get started -->

</div>

<!-- end row -->

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
	 */

	// pagefunction
	
	var pagefunction = function() {

		$('#forumPost').summernote({
			height : 180,
			focus : false,
			tabsize : 2
		});

	};
	
	// end pagefunction
	
	// load summernote editor
	loadScript("js/plugin/summernote/summernote.min.js", pagefunction);

</script>
