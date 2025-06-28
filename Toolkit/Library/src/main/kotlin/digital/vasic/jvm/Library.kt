package digital.vasic.jvm

import java.util.Properties

object Library {

    fun getVersion(): String {

        return object {}.javaClass.getResource("/application.properties")?.openStream().use { stream ->

            val props = Properties()

            props.load(stream)
            props.getProperty("version")
        }
    }
}