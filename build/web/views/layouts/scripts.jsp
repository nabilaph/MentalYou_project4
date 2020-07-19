<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script>
    const scrolltop = document.querySelector("#btnScrollToTop");

    scrolltop.addEventListener("click", function(){
    window.scrollTo({
        top: 0,
        left : 0,
        behavior: "smooth",
    });
});

const scroll = document.querySelector(".chev");

scroll.addEventListener("click", function(){
    window.scrollTo({
        top: 625,
        left : 0,
        behavior: "smooth",
    });
});
</script>  
