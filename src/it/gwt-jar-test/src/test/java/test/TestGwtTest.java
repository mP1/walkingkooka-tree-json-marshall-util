package test;

import com.google.gwt.junit.client.GWTTestCase;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.function.Function;

import walkingkooka.j2cl.locale.LocaleAware;
import walkingkooka.tree.expression.ExpressionNumberKind;
import walkingkooka.tree.json.JsonNode;
import walkingkooka.tree.json.marshall.util.MarshallUtils;
import walkingkooka.tree.json.marshall.JsonNodeMarshallContext;
import walkingkooka.tree.json.marshall.JsonNodeMarshallContexts;
import walkingkooka.tree.json.marshall.JsonNodeUnmarshallContext;
import walkingkooka.tree.json.marshall.JsonNodeUnmarshallContexts;

@LocaleAware
public class TestGwtTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "test.Test";
    }

    public void testAssertEquals() {
        assertEquals(
                1,
                1
        );
    }

    public void testMapper() {
        MarshallUtils.mapper(
                BigDecimal.class,
                JsonNodeUnmarshallContexts.basic(
                        ExpressionNumberKind.BIG_DECIMAL,
                        MathContext.DECIMAL32
                ),
                JsonNodeMarshallContexts.basic(),
                Function.identity()
        );
    }
}
