<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- TRIGGER BUTTON:
<a href="/my-ajax-page.html" data-toggle="modal" data-target="#remoteModal" class="btn btn-default">Open Modal</a>  -->

<!-- MODAL PLACE HOLDER
<div class="modal fade" id="remoteModal" tabindex="-1" role="dialog" aria-labelledby="remoteModalLabel" aria-hidden="true">
<div class="modal-dialog">
<div class="modal-content"></div>
</div>
</div>   -->
<!--////////////////////////////////////-->

<!--<div class="modal-header">
<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
&times;
</button>
<h4 class="modal-title" id="myModalLabel">Command List</h4>
</div>-->
<div class="modal-body">

	<h1><i class="fa fa-microphone text-muted"></i>&nbsp;&nbsp; SmartAdmin Voice Command</h1>
	<hr class="simple">
	<h5>Instruction</h5>

	Click <span class="text-success">"Allow"</span> to access your microphone and activate Voice Command.
	You will notice a <span class="text-primary"><strong>BLUE</strong> Flash</span> on the microphone icon indicating activation.
	The icon will appear <span class="text-danger"><strong>RED</strong></span> <span class="label label-danger"><i class="fa fa-microphone fa-lg"></i></span> if you <span class="text-danger">"Deny"</span> access or don't have any microphone installed.
	<br>
	<br>
	As a security precaution, your browser will disconnect the microphone every 60 to 120 seconds (sooner if not being used). In which case Voice Command will prompt you again to <span class="text-success">"Allow"</span> or <span class="text-danger">"Deny"</span> access to your microphone.
	<br>
	<br>
	If you host your page over <strong>http<span class="text-success">s</span></strong> (secure socket layer) protocol you can wave this security measure and have an unintrupted Voice Command.
	<br>
	<br>
	<h5>Commands</h5>
	<ul>
		<li>
			<strong>'show' </strong> then say the <strong>*page*</strong> you want to go to. For example <strong>"show inbox"</strong> or <strong>"show calendar"</strong>
		</li>
		<li>
			<strong>'mute' </strong> - mutes all sound effects for the theme.
		</li>
		<li>
			<strong>'sound on'</strong> - unmutes all sound effects for the theme.
		</li>
		<li>
			<span class="text-danger"><strong>'stop'</strong></span> - deactivates voice command.
		</li>
		<li>
			<span class="text-primary"><strong>'help'</strong></span> - brings up the command list
		</li>
		<li>
			<span class="text-danger"><strong>'got it'</strong></span> - closes help modal
		</li>
		<li>
			<strong>'hide navigation'</strong> - toggle navigation collapse
		</li>
		<li>
			<strong>'show navigation'</strong> - toggle navigation to open (can be used again to close)
		</li>
		<li>
			<strong>'scroll up'</strong> - scrolls to the top of the page
		</li>
		<li>
			<strong>'scroll down'</strong> - scrollts to the bottom of the page
		</li>
		<li>
			<strong>'go back' </strong> - goes back in history (history -1 click)
		</li>
		<li>
			<strong>'logout'</strong> - logs you out
		</li>
	</ul>
	<br>
	<h5>Adding your own commands</h5>
	Voice Command supports up to 80 languages. Adding your own commands is extreamly easy. All commands are stored inside <strong>app.config.js</strong> file under the <code>var commands = {...}</code>. 

	<hr class="simple">
	<div class="text-right">
		<button type="button" class="btn btn-success btn-lg" data-dismiss="modal">
			Got it!
		</button>
	</div>

</div>
<!--<div class="modal-footer">
<button type="button" class="btn btn-primary" data-dismiss="modal">Got it!</button>
</div> -->