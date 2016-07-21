;(function($) {
	function loadingBarTarget ($_this){
		if($_this.parent() && $_this.parent().hasClass('ui-dialog')){
			return $($_this).parent();
		}else{
			return $($_this);
		}
	}
	$.fn.loading = function() {
		var $_this = jQuery(this);
		var argSize = arguments.length;
		var message = "Loading...";
		if (argSize == 1) {
			message = arguments[0];
		}
		
		$(loadingBarTarget($_this)).mask(message);
		
	};

	$.fn.wait = function() {
		var argSize = arguments.length;
		var message = gf_msg_loading;
		if (argSize == 1) {
			message = arguments[0];
		}
		var $_this = jQuery(this);
		$(loadingBarTarget($_this)).mask(message);
	};
	
	$.fn.processing = function() {
		var argSize = arguments.length;
		var message = "Processing...";
		if (argSize == 1) {
			message = arguments[0];
		}
		var $_this = jQuery(this);
		$(loadingBarTarget($_this)).mask(message);
	};
	
	$.fn.searching = function() {
		var argSize = arguments.length;
		var message = "Searching..."; 
		if (argSize == 1) {
			message = arguments[0];
		}
		var $_this = jQuery(this);
		$(loadingBarTarget($_this)).mask(message);
	};
	
	$.fn.complete = function() {
		var $_this = jQuery(this);
		$(loadingBarTarget($_this)).unmask();
	};
	
	function maxZindex() {
		var maxZ = Math.max.apply(null, $.map($('body > *'), function(e, n) {
			if ($(e).css('position') == 'absolute')
				return parseInt($(e).css('z-index')) || 1;
		}));
		return maxZ + 2;
	}
})(jQuery);
