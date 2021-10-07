/*
 * Copyright 2019 Miroslav Pokorny (github.com/mP1)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package walkingkooka.tree.json.marshall.util;

import walkingkooka.reflect.PublicStaticHelper;
import walkingkooka.tree.json.JsonNode;
import walkingkooka.tree.json.marshall.JsonNodeMarshallContext;
import walkingkooka.tree.json.marshall.JsonNodeUnmarshallContext;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Collection of static factory methods and similar helper methods.
 */
public final class MarshallUtils implements PublicStaticHelper {

    /**
     * {@see JsonNodeMarshallUnmarshallMapperFunction}
     */
    public static <T> UnaryOperator<JsonNode> mapper(final Class<T> type,
                                                     final JsonNodeUnmarshallContext unmarshallContext,
                                                     final JsonNodeMarshallContext marshallContext,
                                                     final Function<T, T> mapper) {
        return JsonNodeMarshallUnmarshallMapperFunction.with(type, unmarshallContext, marshallContext, mapper);
    }

    /**
     * Stops creation
     */
    private MarshallUtils() {
        throw new UnsupportedOperationException();
    }
}
