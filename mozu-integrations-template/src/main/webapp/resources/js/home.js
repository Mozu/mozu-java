var homeViewModel = function() {
	var self = this;
	self.buildVersion = ko.observable();

    self.save = function() {
    };

    self.getVersion = function() {
	    $.ajax({
	        url: "version",
	        type: "GET",
	        dataType: "text",
	        success: function (data) {
	            self.buildVersion(data)
	        },
	        error:function () {
	            $("#content").hide();
	        }
	    });
    }
};

ko.bindingHandlers.chosen = 
{
  update: function(element) 
  {
	  $(element).chosen({width:"95%"});
	  $(element).trigger('liszt:updated');
  }
};


$(document).ajaxError(function (event, jqxhr, settings, exception) {
	console.log(exception);
	console.log(event);
	console.log(settings);
	console.log(jqxhr);
	if (jqxhr.status >= 200 && jqxhr.status <= 300)
		return;
    if (jqxhr.responseJSON != null)
        $("#serverErrorMessage").html(jqxhr.responseJSON.message);
    else if (jqxhr.responseText != null)
        $("#serverErrorMessage").html(jqxhr.responseText);
    else {
        $("#serverErrorMessage").html(jqxhr.statusText);
    }
    $("#serverError").show();
});

function closeError() {
    $("#serverError").hide();
}


$(function () {
	
	$.ajaxPrefilter(function (options, originalOptions, jqXHR) {
		console.log(originalOptions);
        $("#serverError").hide();
        $("#progressIndicator").show();
        jqXHR.complete(function () {
           $("#progressIndicator").hide();
        });
        
    });
	
	$(".tabs a").click(function(e) {
		var tabElement = e.target.parentElement;
		var newTab = e.target;
		var parent = tabElement.parentElement;
		var activeTab = $(parent).find('.active');
		var activeTabId = activeTab.data('tab-id');
		var newTabId = $(newTab).data('tab-id');
		var hideSave = $(newTab).data('hide-save');
		
		if (activeTabId == newTabId) return;
		
		activeTab.removeClass('active');
		$(newTab).addClass('active');

		$('#' + activeTabId).fadeOut('fast', function() {
			$('#' + newTabId).fadeIn('fast');
		});

		if (hideSave) {
			$("#saveBtn").hide();
		} else {
			$("#saveBtn").show();
		}
	})
    
    window.homeViewModel = new homeViewModel();

    window.homeViewModel.getVersion();

});
