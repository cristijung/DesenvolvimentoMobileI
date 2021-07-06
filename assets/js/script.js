AOS.init();

jQuery('document').ready(function(){

  // TBAS

   jQuery('.bx-nav-tab').on( "click", function( event ) {

    jQuery( event.currentTarget).find('li').removeClass('active');
    jQuery( event.target ).addClass('active');

    var target = jQuery( event.target ).index();

    jQuery(this).next().find('li').removeClass('active');
    jQuery(this).next().find('li').eq(target).addClass('active');

    swiperGanhar.update();
    swiperTreinamento.update();
  });


  // Slide
    
  var swiper = new Swiper(".slideBeneficios", {
    slidesPerView: "auto",
    centeredSlides: true,
    spaceBetween: 10,
     loop: true,
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
  });

  // Slide
    
  var swiperGanhar = new Swiper(".slideGanhar", {
    slidesPerView: "auto",
    centeredSlides: true,
     loop: true,
    spaceBetween: 10,
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
  });

  // Slide
    
  var swiperTreinamento = new Swiper(".slideTreinamento", {
    slidesPerView: "auto",
    centeredSlides: true,
     loop: true,
    spaceBetween: 10,
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
  });

  // Slide depoimentos
    
  var swiperDepoimentos = new Swiper(".slideDepoimentos", {
    slidesPerView: 1,
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
      navigation: {
      nextEl: '.swiper-ods-button-next',
      prevEl: '.swiper-ods-button-prev',
      },
  });


  // ACCORDION

  jQuery('.toggle').click(function() {
    let $this = jQuery(this);
    
    jQuery('.toggle').removeClass('active');
    $this.addClass('active');
    
    if ($this.next().hasClass('show')) {
      $this.next().removeClass('show');
      $this.next().slideUp(350);
      jQuery('.toggle').removeClass('active');
    } else {
      $this.parent().parent().find('li .inner').removeClass('show');
      $this.parent().parent().find('li .inner').slideUp(350);
      $this.next().toggleClass('show');
      $this.next().slideToggle(350);
    }
  });


  jQuery('.bx-oquee').waypoint(function(direction) {
    jQuery('#masthead').toggleClass('sticky');
  }, {
    offset: '0%'
  });

   jQuery('.bx-oquee').waypoint(function(direction) {
      jQuery('.btn-cta').toggleClass('active');
    }, {
      offset: '80%'
    });

   jQuery('.scrolltomore').on('click', function (e) {
    jQuery('html, body').animate({
      scrollTop: jQuery(".bx-oquee").offset().top
    }, 360);
  });


});	