$(function() {
    bindPageClick();
});

function bindPageClick() {

    $('.page-url').each(function() {
        $(this).click(function() {
            var url = $(this).attr('page-url');
            if (url) {
                index_form().attr('action', url).submit();
            }
        });
    });
}

function index_form() {
    return $('<form method="post"></form>');
}