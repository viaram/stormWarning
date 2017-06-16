package org.maria.stormwarning

import com.sun.org.apache.xerces.internal.parsers.XMLParser
import khttp.get
import mu.KLogging

class WeatherWarningService {

	companion object : KLogging()


	internal val url: String = "http://warnungen.zamg.at/html/de/heute/alle/at/niederoesterreich/sankt_poelten_stadt/";

	fun printUrl() {
		logger.info { "$url" }

	}
	
	fun getData() {
		val r = get(url)		
		logger.info("${r.text}")
		XMLParser p = new XML
	}
	
	

}