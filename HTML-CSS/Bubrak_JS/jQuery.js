
$(document).ready(function(){
   
    var main = $('.result');
    $('select').change(function(){
        main.show();
        //main.css({"transform": "rotate(180deg)"});
        main.fadeIn();
        main.animate({height: '50px', opacity:'.5'}, 500);  
        main.animate({width: '40%', opacity: '.5'},500);
        main.animate({top: '20%', opacity: '1'},500);
    
        //main.animate({left: '100px'}, "slow");
        //main.animate({fontSize: 'em'}, "slow");
        const PK1_Dollar = 0.00574106; //PK
        const EUR1_Dollar = 1.12820; //EUR
        const GBP1_Dollar = 1.34441; // GBP
        const AUD1_Dollar = 0.723417; // AUD
        const CNY1_Dollar = 0.156573; // CNY
        const NZD1_Dollar = 0.699451; // NZD
        const AED1_Dollar = 0.272294; //AED
        const SAR_Dollar = 0.266667; // SAR
        const JPY1_Dollar = 0.00877541; //JPY
        
        const curr = {pk: 12, ind: 14};
        console.log(curr.ind.toString());

        // pk us  eur gbp aud cny  nzd aed sar jpy

        const pk = {pk: 1, us: 0.00574106,  eur: 0.00508876, gbp: 0.00427026, aud: 0.00793610, cny: 0.0366670,  nzd:  0.00820795, aed: 0.0210840, sar: 0.0215290, jpy: 0.654096};
        const us = {pk: 174.184, us: 1,  eur: 1.12818, gbp: 0.743810, aud: 1.38234, cny: 6.38680,  nzd: 1.42969, aed: 3.67250, sar: 3.75000, jpy: 113.933};
        const eur = {pk: 196.512, us: 1.12820,  eur: 1, gbp: 0.839155, aud: 1.55953, cny: 7.20549,  nzd: 1.61296, aed: 4.14326, sar: 4.23069, jpy: 128.537}; 
        // const gbp = {pk: 234.178, us: 1.34441,  eur: 1.19168, gbp: 1, aud: , cny: ,  nzd: , aed: , sar: , jpy: };
        // const aud = {pk: 126.006, us: 0.723417,  eur: 0.641217, gbp: , aud: 1, cny: ,  nzd: , aed: , sar: , jpy: };
        // const cny = {pk: 27.2725, us: 0.156573,  eur: 0.138783, gbp: , aud: , cny: 1,  nzd: , aed: , sar: , jpy: };
        // const nzd = {pk: 121.833, us: 0.699451,  eur: 0.619980, gbp: , aud: , cny: ,  nzd: 1, aed: , sar: , jpy: };
        // const aed = {pk: 47.4292, us: 0.272294,  eur: 0.241356, gbp: , aud: , cny: ,  nzd: , aed: 1, sar: , jpy: };
        // const sar = {pk: 46.4490, us: 0.266667,  eur: 0.236368, gbp: , aud: , cny: ,  nzd: , aed: , sar: 1, jpy: };
        // const jpy = {pk: 1.52883, us: 0.00877541,  eur: 0.00777983, gbp: , aud: , cny: ,  nzd: , aed: , sar: , jpy: 1};
        
        var fromCurr = $('select.currencyFrom').find(':selected').val();
        var toCurr = $('select.currencyTo').find(':selected').val();
        var fromCurrR = $('select.currencyFrom').find(':selected').text();
        var toCurrR = $('select.currencyTo').find(':selected').text();
        var toNumber = $('#toNumber').val();
        var fromNumber = $('#fromNumber').val();
        var result;
        console.log(toCurr);
        console.log(fromCurr);

       // $('#result').text("result");
        
        switch(fromCurr)
        {
            case "pk":
                    switch(toCurr)
                    {
                        case "pk":
                            result = parseInt(fromNumber);
                            $('#result').text("1 "  + fromCurrR + " = " + pk.pk + " " + toCurrR);
                            $('#toNumber').val(result);
                            
                            break;
                        case "us":
                            result = parseInt(fromNumber) * pk.us;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.us + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "eur":
                            result = parseInt(fromNumber) * pk.eur;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.eur + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "gbp":
                            result = parseInt(fromNumber) * pk.gbp;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.gbp + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "aud":
                            result = parseInt(fromNumber) * pk.aud;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.aud + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "cny":
                            result = parseInt(fromNumber) * pk.cny;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.cny + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "nzd":
                            result = parseInt(fromNumber) * pk.nzd;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.nzd + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "aed":
                            result = parseInt(fromNumber) * pk.aed;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.aed + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "sar":
                            result = parseInt(fromNumber) * pk.sar;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.sar + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "jpy":
                            result = parseInt(fromNumber) * pk.jpy;
                            $('#result').text("1 "  + fromCurrR + " = " + pk.jpy + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        default:
                            console.log("Inner Switch!");
                            break;
                    }
                
                break;
                case "us":
                    switch(toCurr)
                    {
                        case "us":
                            result = parseInt(fromNumber);
                            $('#result').text("1 "  + fromCurrR + " = " + us.us + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "pk":
                            result = parseInt(fromNumber) * us.pk;
                            $('#result').text("1 "  + fromCurrR + " = " + us.pk + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "eur":
                            result = parseInt(fromNumber) * us.eur;
                            $('#result').text("1 "  + fromCurrR + " = " + us.eur + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "gbp":
                            result = parseInt(fromNumber) * us.gbp;
                            $('#result').text("1 "  + fromCurrR + " = " + us.gbp + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "aud":
                            result = parseInt(fromNumber) * us.aud;
                            $('#result').text("1 "  + fromCurrR + " = " + us.aud + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "cny":
                            result = parseInt(fromNumber) * us.cny;
                            $('#result').text("1 "  + fromCurrR + " = " + us.cny + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "nzd":
                            result = parseInt(fromNumber) * us.nzd;
                            $('#result').text("1 "  + fromCurrR + " = " + us.nzd + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "aed":
                            result = parseInt(fromNumber) * us.aed;
                            $('#result').text("1 "  + fromCurrR + " = " + us.aed + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "sar":
                            result = parseInt(fromNumber) * us.sar;
                            $('#result').text("1 "  + fromCurrR + " = " + us.sar + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "jpy":
                            result = parseInt(fromNumber) * us.jpy;
                            $('#result').text("1 "  + fromCurrR + " = " + us.jpy + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        default:
                            console.log("Inner Switch!");
                            break;
                    }
                
                break;
            
            case "eur":
                    switch(toCurr)
                    {
                        case "eur":
                            result = parseInt(fromNumber);
                            $('#result').text("1 "  + fromCurrR + " = " + eur.eur + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "pk":
                            result = parseInt(fromNumber) * eur.pk;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.pk + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "us":
                            result = parseInt(fromNumber) * eur.us;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.us + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "gbp":
                            result = parseInt(fromNumber) * eur.gbp;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.gbp + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "aud":
                            result = parseInt(fromNumber) * eur.aud;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.aud + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "cny":
                            result = parseInt(fromNumber) * eur.cny;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.cny + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "nzd":
                            result = parseInt(fromNumber) * eur.nzd;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.nzd + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "aed":
                            result = parseInt(fromNumber) * eur.aed;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.aed + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "sar":
                            result = parseInt(fromNumber) * eur.sar;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.sar + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        case "jpy":
                            result = parseInt(fromNumber) * eur.jpy;
                            $('#result').text("1 "  + fromCurrR + " = " + eur.jpy + " " + toCurrR);
                            $('#toNumber').val(result);
                            break;
                        default:
                            console.log("Inner Switch!");
                            break;
                    }
                
                break;
                
            // case 3 of main switch
            default:
                console.log("outter switch");
                break;
        }
    });
});

