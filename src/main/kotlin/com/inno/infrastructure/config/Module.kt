package com.inno.infrastructure.config

import com.inno.application.CleaningFactory
import com.inno.domain.ports.RobotInputPort
import com.inno.domain.ports.RobotOutputPort
import com.inno.infrastructure.adapters.RobotInputAdapter
import com.inno.infrastructure.adapters.ConsoleOutputAdapter
import org.koin.dsl.module


val applicationModule = module {

    single { CleaningFactory() }

    single<RobotInputPort> { RobotInputAdapter() }

    single<RobotOutputPort> { ConsoleOutputAdapter() }
}

