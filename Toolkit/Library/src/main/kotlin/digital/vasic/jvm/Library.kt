package digital.vasic.jvm

import java.util.Properties

object Library {

    fun getVersion(): String {

        return object {}.javaClass.getResource("/version.properties")?.openStream().use { stream ->

            val props = Properties()

            props.load(stream)
            props.getProperty("version")
        }
    }
}