/**
 * Created by geoff_000 on 10/01/2016.
 */
    class ExpandoMetaClassTest extends GroovyTestCase {
        void testExpandoMetaClass(){
            String message = "Hello"
            shouldFail(MissingMethodException){
                message.shout()
            }
            String.metaClass.shout = { ->
                delegate.toUpperCase()
            }
            assertEquals "HELLO", message.shout()
            String.metaClass = null
            shouldFail{
                message.shout()
            }
        }
    }

