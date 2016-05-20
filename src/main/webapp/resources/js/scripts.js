$(document).ready(function ()
{

	/* Select first tab */
	$(".nav-tabs a:first").tab("show");

	/*Remove modal window*/
	$(".triggerRemove").on("click", function (e)
	{
		e.preventDefault();
		$("#modalRemove .btnRemove").attr("href", $(this).attr("href"));
		$("#modalRemove").modal();
	});

	$(".formValidate").validate(
	{
		rules:
		{
			name:
			{
				required: true,
				minlength: 3,
				maxlength: 30,
				remote:
				{
					url: "/registration/valid.html",
				},
			},
			email:
			{
				required: true,
				email: true,
			},
			password:
			{
				required: true,
				minlength: 7,
				maxlength: 30,
			},
			url:
			{
				required: true,
				url: true,
			},
		},
		highlight: function (e)
		{
			$(e).closest(".form-group").removeClass("has-success").addClass("has-error");
		},
		unhighlight: function (e)
		{
			$(e).closest(".form-group").removeClass("has-error").addClass("has-success");
		},
		messages:
		{
			name:
			{
				remote: "Such username already exist.",
			},
		},
	});
});